package Conditionals_Loops;

import java.util.Scanner;

public class GCDorHCFOptimalApproach {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the num1 : ");
		int n2 = sc.nextInt();
		
		int gcd = findGcd(n1 , n2);
		
		System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}
	
	public static int findGcd(int n1 , int n2)
	{
		while(n1 > 0 && n2 > 0)
		{
			if(n1 > n2)
			{
				n1 = n1 % n2;
			}
			else
			{
				n2 = n2 % n1;
			}
		}
		
		if(n1 == 0)
		{
			return n2;
		}
		return n1;
	}  // Time Complexity : O(logfi(min(n1 , n2)))

}
