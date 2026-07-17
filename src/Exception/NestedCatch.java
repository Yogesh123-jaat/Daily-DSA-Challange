package Exception;

public class NestedCatch
{
	public static void main(String[] args) 
	{
		int[] balances = {5000,3000,7000};
		
		try
		{
			System.out.println("Account is accessing...");
			int acIdx = 1;  // 5 for run outer catch block
			int balance = balances[acIdx];
			System.out.println("Balance is : " + balance);
			
			try
			{
				int shareCount = 0;
				int perShare = balance / shareCount;
				System.out.println("per share : " + perShare);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inner : divide by zero - " + e.getMessage());
			}
			
			System.out.println("This line is also executes.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong index : " + e.getMessage());
		}
		
		System.out.println("Program runs safely");
	}
}
