package Oops.Polymorphism.task2;

public class Doctor extends HospitalPerson
{
	@Override
	public void performDuty() 
	{
		System.out.println("Doctor is performing duty.");
	}
	public void prescribeMedicine()
	{
		System.out.println("Doctor is prescribing medicine.");
	}
}
