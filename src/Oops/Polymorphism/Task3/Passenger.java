package Oops.Polymorphism.Task3;

public class Passenger extends AirportUser
{
	@Override
	public void accessAirport() 
	{
		System.out.println("Passenger access limited area of airport.");
	}
	
	public void checkIn()
	{
		System.out.println("Check in is mandatory for all passenger.");
	}
}
