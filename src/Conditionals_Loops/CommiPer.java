package Conditionals_Loops;

import java.util.Scanner;

public class CommiPer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the sales amount : ");
		double salesAmount = sc.nextDouble();
		
		System.out.println("Enter the commission amount : ");
		double commissionEarned = sc.nextDouble();
		
		
		if(salesAmount <= 0)
		{
			System.out.println("Invalid sales amount...");
		}
		else if(commissionEarned >= salesAmount)
		{
			System.out.println("Invalid commission amount");
		}
		else
		{
			double percentage = calcPer(salesAmount , commissionEarned);
			System.out.println("Commission percent is : " + percentage);
		}
	}
	
	public static double calcPer(double sales , double commission)
	{
		double commissionPercent = (commission/sales) * 100;
		
		return commissionPercent;
	}

}
