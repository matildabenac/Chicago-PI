package chicago_pi;

public class Search {
	
	String time_from;
	String time_to;
	String location;
	String type;
	String filePath;
	
	public Search(String time_from, String time_to, String location, String type)
	{
		this.time_from = time_from;
		this.time_to = time_to;
		this.location = location;
		this.type = type;
	}
	
	public Search(String filePath)
	{
		this.filePath = filePath;
	}
	
	
}
