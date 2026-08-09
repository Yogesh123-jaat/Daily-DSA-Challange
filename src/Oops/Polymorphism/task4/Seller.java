package Oops.Polymorphism.task4;

public class Seller extends User
{
	@Override
    public void usePortal() 
	{
        System.out.println("Portal: Seller logged into inventory dashboard.");
    }

    public void addProduct() 
    {
        System.out.println("Specific Method: New product added to the catalog!");
    }
}
