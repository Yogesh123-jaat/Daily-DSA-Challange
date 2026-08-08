package Oops.Polumorphism.task1;

public class SavingsCustomer extends Customer
{
	@Override
	public void getService() 
	{
		System.out.println("Service : Handling savings account operations.");	
	}
	
	public void getPassbook()
	{
		System.out.println("Specific Method: Passbook updated successfully!");
	}
}
