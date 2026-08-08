package Oops.Polumorphism.task1;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select customer type : ");
		System.out.println("1) Savings Customer");
		System.out.println("2) Current Customer");
		System.out.println("3) Loan Customer");
		System.out.println("4) Premiusm Customer");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		Customer customer = null;
		
		switch(choice)
		{
		case 1: 
			customer = new SavingsCustomer();
			break;
				
		case 2:
            customer = new CurrentCustomer(); // Upcasting
            break;
            
        case 3:
            customer = new LoanCustomer();   
            break;
            
        case 4:
            customer = new PremiumCustomer(); 
            break;
            
        default:
            System.out.println("Invalid choice!");
            return;
		}
		
		customer.getService();
		
		if(customer instanceof SavingsCustomer)
		{
			SavingsCustomer savings = (SavingsCustomer)customer;
			savings.getPassbook();
		}
		else if(customer instanceof CurrentCustomer)
		{
			CurrentCustomer current = (CurrentCustomer)customer;
			current.getChequeBook();
		}
		else if(customer instanceof LoanCustomer)
		{
			LoanCustomer loan = (LoanCustomer)customer;
			loan.getLoanDetails();
		}
		else 
		{
			PremiumCustomer premium = (PremiumCustomer)customer;
			premium.getLoungeAccess();
		}
	}

}
