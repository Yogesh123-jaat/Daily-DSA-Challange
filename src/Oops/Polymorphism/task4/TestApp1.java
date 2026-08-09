package Oops.Polymorphism.task4;

import java.util.Scanner;

public class TestApp1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("--- E-Commerce Platform System ---");
        System.out.println("Select User Type:");
        System.out.println("1. Customer");
        System.out.println("2. Seller");
        System.out.println("3. Delivery Boy");
        System.out.println("4. Admin");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = sc.nextInt();

        User user = null;

        switch (choice) {
            case 1:
                user = new Customer();    // Upcasting
                break;
            case 2:
                user = new Seller();      // Upcasting
                break;
            case 3:
                user = new DeliveryBoy(); // Upcasting
                break;
            case 4:
                user = new Admin();       // Upcasting
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\n--- Executing Portal Activity ---");
        
        user.usePortal();

        if (user instanceof Customer) 
        {
            Customer c = (Customer) user; // Downcasting
            c.placeOrder();
        } 
        else if (user instanceof Seller) 
        {
            Seller s = (Seller) user;     // Downcasting
            s.addProduct();
        } 
        else if (user instanceof DeliveryBoy) 
        {
            DeliveryBoy db = (DeliveryBoy) user; // Downcasting
            db.deliverProduct();
        } 
        else if (user instanceof Admin) 
        {
            Admin a = (Admin) user;       // Downcasting
            a.manageSystem();
        }
	}
}
