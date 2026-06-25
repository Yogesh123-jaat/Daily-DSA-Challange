package Conditionals_Loops;

import java.util.Scanner;

public class GCDorHCFBruteForce {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the num2 : ");
		int n2 = sc.nextInt();
		
		int gcd = findgcd(n1 , n2);
		
		System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}
	
	public static int findgcd(int n1 , int n2)
	{
		int gcd = 1;
		
		for(int i = 1; i <= Math.min(n1 ,  n2); i++)
		{
			if(n1 % i == 0 && n2 % i == 0)
			{
				gcd = i;
			}
		}  //Time Complexity : O(min(N1 , N2))
		
		return gcd;
	}

}
