package Exception.FinallyVsReturn;

public class TestApp1 
{
	public static int testA()
	{
		try
		{
			return 5;
		}
		finally
		{
			System.out.println("Cleanup");
		}
	}
	
	public static int testB()
	{
		try
		{
			return 5;
		}
		finally
		{
			return 10;
		}
	}
	public static int testC()
	{
		try
		{
			throw new RuntimeException("Error");
		}
		finally
		{
			return 100;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(testA());
		System.out.println(testB());
		System.out.println(testC());
	}
}
