package Oops.Polymorphism.task2;

public class Receptionist extends HospitalPerson
{
	@Override
	public void performDuty() 
	{
		System.out.println("Receptionist performing her duty.");
	}
	
	public void bookAppointment()
	{
		System.out.println("receptionist booking appointment.");
	}
}
