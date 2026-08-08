package Oops.Polymorphism.Task3;

public class GroundStaff extends AirportUser
{
	@Override
	public void accessAirport() 
	{
		System.out.println("Ground staff is for passenger help.");
	}
	
	public void manageBaggage()
	{
		System.out.println("Ground staff manager baggage.");
	}
}
