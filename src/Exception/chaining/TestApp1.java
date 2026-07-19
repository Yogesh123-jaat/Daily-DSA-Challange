package Exception.chaining;

public class TestApp1 
{
	public static void processPayment() throws PaymentException
	{
		try
		{
			int ans = 10/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			throw new PaymentException("Payment process nahi ho paya" , e);
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			processPayment();
		}
		catch(PaymentException e)
		{
			System.out.println("Naya message: " + e.getMessage());
            System.out.println("Asli cause: " + e.getCause());
            e.printStackTrace();
		}
	}
}
