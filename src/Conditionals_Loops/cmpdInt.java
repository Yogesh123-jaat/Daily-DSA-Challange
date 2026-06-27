package Conditionals_Loops;

import java.util.Scanner;

public class cmpdInt {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount : ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of interest : ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time duration : ");
		int time = sc.nextInt();
		
		
		if(principal <= 0 || rate < 0 || time <= 0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			double totalAmount = calcAmount(principal , rate , time);
			double compoundInterest = totalAmount - principal;
			
			System.out.println("-------Investment Report----------");
			System.out.println("Principal Amount : " + principal);
			System.out.println("Compound Interest : " + compoundInterest);
			System.out.println("Total Amount : " + totalAmount);
		}
	}
	
	public static double calcAmount(double p , double r , int t)
	{
		double base = 1 + (r / 100);
		
		double amount = p * Math.pow(base, t);
		
		return amount;
	}

}
