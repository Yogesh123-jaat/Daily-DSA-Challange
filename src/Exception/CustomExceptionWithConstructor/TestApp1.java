package Exception.CustomExceptionWithConstructor;

public class TestApp1 
{
	public static void registerVoter(String age) throws InvalidAgeException
	{
		int no = 0;
		try
		{
			no = Integer.parseInt(age);
		}
		catch(NumberFormatException e)
		{
			throw new InvalidAgeException("You have to enter number" , e);
		}
		
		if (no < 18)
		{
			throw new InvalidAgeException("You can't enter age less than 18 : Your age - " + age);
		}
		System.out.println("Voter registered successfully.");
	}
	
	public static void onlyCause() throws InvalidAgeException
	{
		try
		{
			int ans = 10/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			throw new InvalidAgeException(e);
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			registerVoter("15");
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Error 1: " + e.getMessage());
		}
		
		try
		{
			registerVoter("hjsag");
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Error 2: " + e.getMessage());
			System.out.println("Cause : " + e.getCause());
		}
		
		try
		{
			onlyCause();
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Error 3: " + e.getMessage());
		}
	}
}
