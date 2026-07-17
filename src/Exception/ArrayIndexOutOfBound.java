package Exception;

public class ArrayIndexOutOfBound
{
	public static void main(String[] args) 
	{
		System.out.println("START");
		
		int[] arr = {10,20,30};
		
		try
		{
			System.out.println(arr[10]);
			
			System.out.println("Hello");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong Array Index : " + e.getMessage());
		}
		
		System.out.println("Program runs safely.");
	}
}
