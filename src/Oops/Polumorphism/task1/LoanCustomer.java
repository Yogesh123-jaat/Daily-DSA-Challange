package Oops.Polumorphism.task1;

public class LoanCustomer extends Customer
{
	@Override
	public void getService() 
	{
		System.out.println("Service: Processing Loan details.");
	}
	public void getLoanDetails()
	{
		System.out.println("Specific Method: Displaying your home/car loan details.");
	}
}
