package Exception.CustomClass;

public class TestApp2 
{
	public static void registerVoter(int age) throws InvalidAgeException 
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Voter ki age kam se kam 18 honi chahiye");
		}
		System.out.println("Voter successfully registered");
	}
	
	public static void main(String[] args) 
	{
		try
		{
			registerVoter(15);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("You can't register for vote : " + e.getMessage());
		}
		
		try
		{
			registerVoter(20);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("You can't register for vote : " + e.getMessage());
		}
	}
}
