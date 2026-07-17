package Exception.throwKeyword;

public class ThrowKeywordWithHandle2 
{
	public static void checkBalance(int balance , int withdrawAmount)
	{
		if(withdrawAmount > balance)
		{
			throw new ArithmeticException("Insufficient balance");
		}
		System.out.println("Withdrawl successful remaining amount : " + (balance - withdrawAmount));
	}
	public static void main(String[] args) 
	{
		System.out.println("START");
		
		try
		{
			checkBalance(1000 , 1500);  
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : " + e.getMessage());
		}
		
		try
		{
			checkBalance(1000 , 500);  
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : " + e.getMessage());
		}
		
		System.out.println("END");
	}
}
