package Exception.StackTrace;

public class TestApp1 
{
	public static void riskyOperation()
	{
		int[] arr = {1,2,3,4,5};
		
		System.out.println(arr[5]);
	}
	public static void main(String[] args) 
	{
		try
		{
			riskyOperation();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("toString(): " + e.toString());
			System.out.println("Direct print: " + e);
			e.printStackTrace();
		}
	}
}
