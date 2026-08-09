package Oops.Polymorphism.task4;

public class Admin extends User
{
	@Override
    public void usePortal() 
	{
        System.out.println("Portal: Admin accessing configuration settings.");
    }

    public void manageSystem() 
    {
        System.out.println("Specific Method: System logs cleared and database optimized!");
    }
}
