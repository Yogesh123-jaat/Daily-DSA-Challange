package Exception.tryWithResources;

public class DataBaseConnection implements AutoCloseable
{
	public DataBaseConnection()
	{
		System.out.println("Connection opened.");
	}
	
	public void query()
	{
		System.out.println("Query is running.");
		int ans = 10/0;
		
		System.out.println(ans);
	}
	
	@Override
	public void close() 
	{
		System.out.println("Connection closed.");	
	}
	
	
}
