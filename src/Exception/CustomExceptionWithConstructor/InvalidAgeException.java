package Exception.CustomExceptionWithConstructor;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException() 
	{
		super();
	}
	
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
	
	public InvalidAgeException(String msg , Throwable cause) 
	{
		super(msg , cause);
	}
	
	public InvalidAgeException(Throwable cause) 
	{
		super(cause);
	}
	
}
