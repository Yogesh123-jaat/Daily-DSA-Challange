package Oops.Polumorphism.task1;

public class PremiumCustomer extends Customer
{
	@Override
	public void getService() 
	{
		System.out.println("Service: Providing Premium elite banking.");
	}
	
	public void getLoungeAccess()
	{
		System.out.println("Specific Method: Airport Lounge Access ticket generated!");
	}
}
