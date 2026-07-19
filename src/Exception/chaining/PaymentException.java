package Exception.chaining;

public class PaymentException extends Exception
{
	public PaymentException(String msg , Throwable cause) 
	{
		super(msg , cause);
	}
	
}
