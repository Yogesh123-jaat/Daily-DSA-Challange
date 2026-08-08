package Oops.Polymorphism.Task3;

public class Pilot extends AirportUser
{
	@Override
	public void accessAirport() 
	{
		System.out.println("Pilot is access many part of airport.");
	}
	
	public void flyAircraft()
	{
		System.out.println("Pilot is flying aircraft.");
	}
}
