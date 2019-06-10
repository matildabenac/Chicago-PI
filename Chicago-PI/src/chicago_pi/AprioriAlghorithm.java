package chicago_pi;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class AprioriAlghorithm extends Search{

	InstanceQuery query = null;
	
	public AprioriAlghorithm(String time_from, String time_to, String location, String type) {
		super(time_from, time_to, location, type);
		// TODO Auto-generated constructor stub
		time_from = "'" + time_from + "'";
		time_to = "'" + time_to + "'";
		
		try {
			query = new InstanceQuery();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	query.setUsername("root");
    	query.setPassword("");
    	
    	String Query = "SELECT Block, Primary_type, Description, Location_description, Arrest FROM Crime WHERE TIME(Date) >= " + time_from + "AND TIME(Date) < " + time_to;
    	
    	if(!location.contentEquals("All"))
    		Query += "AND Block = " + location;
    	
    	if(!type.contentEquals("All"))
    		Query += "AND Primary_type = '" + type + "'";
    	
    	query.setQuery(Query);
	}
	
	public String search()
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
        
        return model.toString();
	}

}
