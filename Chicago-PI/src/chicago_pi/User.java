package chicago_pi;

public class User {
	
	private int id;
	private String username;
	private String FirstName;
	private String LastName;
	
	public User(int id, String username, String FirstName, String LastName)
	{
		this.id = id;
		this.username = username;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	
	
	public String getUsername()
	{
		return username;
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public int getId()
	{
		return id;
	}
	
}
