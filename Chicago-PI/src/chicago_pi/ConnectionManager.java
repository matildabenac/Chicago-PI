package chicago_pi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionManager {

	private static String username = "root";
	private static String password = "";
	private static String DB_URL = "jdbc:mysql://localhost:3306/Chicago-PI?serverTimezone=UTC";
	private static Connection conn = null;
	
	public ConnectionManager() {}
	
	public Connection createConnection()
	{
		//com.mysql.cj.jdbc.Driver
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public Statement createStatement()
	{
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	
}
