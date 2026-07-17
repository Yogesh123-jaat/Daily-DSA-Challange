package Exception.FinallyBlock;

public class WithExceptionButCatchNotMatch 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Try block is running.");
			int result = 10/0;
			
			System.out.println("Result : " + result);
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch block is running.");
		}
		finally
		{
			System.out.println("Finally block will always run.");
		}
		
		System.out.println("Aage ka code");
	}
}
