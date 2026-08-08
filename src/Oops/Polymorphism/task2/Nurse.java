package Oops.Polymorphism.task2;

public class Nurse extends HospitalPerson
{
	@Override
	public void performDuty() 
	{
		System.out.println("Nurse is performing duty.");
	}
	
	public void assistPatient() 
	{
		System.out.println("Nurse is assisting patient.");
	}
}
