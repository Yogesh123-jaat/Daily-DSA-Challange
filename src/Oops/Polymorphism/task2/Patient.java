package Oops.Polymorphism.task2;

public class Patient extends HospitalPerson
{
	@Override
	public void performDuty() 
	{
		System.out.println("patient is admit in the hospital.");
	}
	
	public void getTreatment() 
	{
		System.out.println("Patient getting treatment.");
	}
}
