package Oops.Polymorphism.task4;

public class DeliveryBoy extends User
{
	@Override
    public void usePortal() 
	{
        System.out.println("Portal: Delivery partner checking assigned tasks.");
    }

    public void deliverProduct() 
    {
        System.out.println("Specific Method: Product status marked as DELIVERED!");
    }
}
