package chicago_pi;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class AprioriAlghorithm extends Search{

	InstanceQuery query = null;
	
	public AprioriAlghorithm(int time_from, int time_to, String location, String type) {
		super(time_from, time_to, location, type);
		// TODO Auto-generated constructor stub
		
		try {
			query = new InstanceQuery();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	query.setUsername("root");
    	query.setPassword("");
    	query.setQuery("select Block, Primary_type, Description, Location_description, Arrest from Crime");
	}
	
	public Apriori search()
	{
    	Instances data = null;
		try {
			data = query.retrieveInstances();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        Apriori model = new Apriori();
        try {
			model.buildAssociations(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return model;
	}

}
