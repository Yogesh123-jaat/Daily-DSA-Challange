package Exception.tryWithResources;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		try(DataBaseConnection db = new DataBaseConnection())
		{
			db.query();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero : " + e.getMessage());
		}
	}
}
