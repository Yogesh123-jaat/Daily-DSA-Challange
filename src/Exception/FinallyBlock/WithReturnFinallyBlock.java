package Exception.FinallyBlock;

public class WithReturnFinallyBlock 
{
	public static int test()
	{
		try
		{
			System.out.println("Try block is running");
			int ans = 10/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e)  // NullPointerException then also finally block running.
		{
			System.out.println("Divide by zero : " + e.getMessage());
		}
		finally
		{
			System.out.println("Finally block will always run");
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int value = test();
		System.out.println("Return value : " + value);
	}
}
