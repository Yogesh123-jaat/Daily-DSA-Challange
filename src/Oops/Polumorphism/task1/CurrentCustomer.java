package Oops.Polumorphism.task1;

public class CurrentCustomer extends Customer
{
	@Override
	public void getService() 
	{
		System.out.println("Service: Handling Current Account transactions.");
	}
	
	public void getChequeBook()
	{
		System.out.println("Specific Method: Cheque book issued successfully!");
	}
}
