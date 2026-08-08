package Oops.Polymorphism.Task3;

public class SecurityOfficer extends AirportUser
{
	@Override
	public void accessAirport() 
	{
		System.out.println("Security Officer is access whole area of airport.");
	}
	
	public void checkSecurity() 
	{
		System.out.println("Security officer checks all passenger.");
	}
}
