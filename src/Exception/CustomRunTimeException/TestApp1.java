package Exception.CustomRunTimeException;

import Exception.CustomRunTimeException.InvalidAgeException;

public class TestApp1 
{
	public static void registerVoterUnchecked(int age) //throws InvalidAgeException 
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
			registerVoterUnchecked(15);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Invalid age : " + e.getMessage());
		}
		registerVoterUnchecked(15);
		
	}
}
