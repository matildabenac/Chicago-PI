package chicago_pi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConnectionManager {

	private static String username = "root";
	private static String password = "";
	private static String DB_URL = "jdbc:mysql://localhost:3306/Chicago-PI?serverTimezone=UTC";
	private static Connection conn = null;
	Statement stmt = null;
	
	public ConnectionManager() {
		
		try {
			conn = DriverManager.getConnection(DB_URL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CreateConnection()
	{
		//com.mysql.cj.jdbc.Driver
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CloseConnection()
	{
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertQuery(String query)
	{
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet sendQuery(String query)
	{
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	
	
}
