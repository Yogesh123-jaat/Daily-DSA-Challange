package Oops.Polymorphism.task4;

public class Customer extends User
{
	@Override
    public void usePortal() 
	{
        System.out.println("Portal: Customer is browsing products.");
    }

    public void placeOrder() 
    {
        System.out.println("Specific Method: Order placed successfully!");
    }
}
