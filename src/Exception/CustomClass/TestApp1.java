package Exception.CustomClass;

public class TestApp1
{
	public static void checkBalance(int balance , int withdrawAmt) throws InsufficientBalanceException
	{
		if(balance < withdrawAmt)
		{
			throw new InsufficientBalanceException("Balance kam hai! Available: " + balance + ", Requested: " + withdrawAmt);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			checkBalance(1000 , 1500);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("Custom Exception caught : " + e.getMessage());
		}
	}
}
