package Exception.compileTime;

public class ClassNotFoundByTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("YogeshJaat");
			System.out.println("Not Found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found : " + e.getMessage());
		}
		
	}
}
