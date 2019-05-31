package chicago_pi;
import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.experiment.InstanceQuery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class Test {
	
    public static void main(String[] args) {
    	
    	/*String dataset = "/home/marin/Documents/wekaProba.csv";
        
        DataSource source = null;
		try {
			source = new DataSource(dataset);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Instances data = null;
		try {
			data = source.getDataSet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	InstanceQuery query = null;
		try {
			query = new InstanceQuery();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	query.setUsername("root");
    	query.setPassword("");
    	query.setQuery("select Block, Primary_type, Description, Location_description, Arrest from Crime");
    	
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
        
        //System.out.println(model);
        
        /*ConnectionManager cm = new ConnectionManager();
        Connection conn = cm.createConnection();
        Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        ResultSet rs = null;
        try {
			rs = stmt.executeQuery("select Block, Primary_type, Description, Location_description, Arrest from Crime");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			while (rs.next())
			{
				System.out.print(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
    }

}