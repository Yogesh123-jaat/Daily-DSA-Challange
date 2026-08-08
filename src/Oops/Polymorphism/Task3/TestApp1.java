package Oops.Polymorphism.Task3;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Airport Management System");
		System.out.println("1) Passenger");
		System.out.println("2) Pilot");
		System.out.println("3) Security Officer");
		System.out.println("4) Ground Staff");
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		
		AirportUser user = null;
		
		switch(choice)
		{
		case 1 : 
			user = new Passenger();
			break;
			
		case 2: 
			user = new Pilot();
			break;
			
		case 3: 
			user = new SecurityOfficer();
			break;
			
		case 4:
			user = new GroundStaff();
			break;
			
		default:
			System.out.println("Invalid choice");
			return;
		}
		
		user.accessAirport();
		
		if(user instanceof Passenger)
		{
			Passenger p = (Passenger)user;
			p.checkIn();
		}
		else if(user instanceof Pilot)
		{
			Pilot pi = (Pilot)user;
			pi.flyAircraft();
		}
		else if(user instanceof SecurityOfficer)
		{
			SecurityOfficer so = (SecurityOfficer)user;
			so.checkSecurity();
		}
		else if(user instanceof GroundStaff)
		{
			GroundStaff gd = (GroundStaff)user;
			gd.manageBaggage();
		}
	}

}
