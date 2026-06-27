package Conditionals_Loops;

import java.util.Scanner;

public class PermutationCombinationCalc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		System.out.println("Enter r : ");
		int r = sc.nextInt();
		
		if(n < 0 || r < 0 || r > n)
		{
			System.out.println("Invalid input");
		}
		else
		{
			long npr = findNpr(n , r);
			long ncr = findNcr(n , r);
			
			System.out.println("\n--- Results ---");
			System.out.println(n + "P" + r + " (Permutation) = " + npr);
			System.out.println(n + "C" + r + " (Combination) = " + ncr);
		}
	}
	
	static long factorial(int n)
	{
		long fact = 1;
		
		for(int i = 1; i <= n; i++)
		{
			fact *= i;
		}
		
		return fact;
	}
	
	static long findNpr(int n , int r)
	{
		long npr = factorial(n) / factorial(n - r);
		return npr;
	}
	
	static long findNcr(int n , int r)
	{
		long ncr = factorial(n) / (factorial(r) * factorial(n-r));
		
		return ncr;
	}

}
