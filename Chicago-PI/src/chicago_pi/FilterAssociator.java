package chicago_pi;


import weka.associations.FilteredAssociator;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

public class FilterAssociator extends Search{
	
	Instances data = null;
	String err = "Baza nije u dobrom formatu";
	private boolean MySQL = true;
	int user_id;
	String fileName = null;
	
	public FilterAssociator(String time_from, String time_to, String location, String type, int user_id) {
		super(time_from, time_to, location, type);
		// TODO Auto-generated constructor stub
		
		this.user_id = user_id;
		
		time_from = "'" + time_from + "'";
		time_to = "'" + time_to + "'";
		
		InstanceQuery query = null;
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
    	
    	
		try {
			data = query.retrieveInstances();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public FilterAssociator(String filePath, int user_id, String fileName) {
		super(filePath);
		
		this.user_id = user_id;
		this.fileName = fileName;
		
		MySQL = false;
		
		DataSource source = null;
		try {
			source = new DataSource(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			;
		}
		
		try {
			data = source.getDataSet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			;
		}
		
	}
	
	public String search()
	{
		
        FilteredAssociator model = new FilteredAssociator();
        try {
			model.buildAssociations(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return err;
		}
        
        ConnectionManager cntMan = new ConnectionManager();
        
        if(MySQL)
        {
        	cntMan.CreateConnection();
        	cntMan.insertQuery("INSERT INTO History (id_user, Searched) VALUES (" + user_id + ", 'Filtered Associator algoritam: Podrucje: " + location + "; Od:" + time_from + "; Do: " + time_to + "; Tip zlocina: " + type + "')");
        	cntMan.CloseConnection();
        }
        else
        {
        	cntMan.CreateConnection();
        	cntMan.insertQuery("INSERT INTO History (id_user, Searched) VALUES (" + user_id + ", 'Filtered Associator algoritam: Baza je ucitana iz datoteke: " + fileName + "')");
        	cntMan.CloseConnection();
        }
        
        return model.toString();
	}

}
