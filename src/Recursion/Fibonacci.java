package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		System.out.println(fun(n));
	}
	
	public static int fun(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		
		int last = fun(n - 1);
		int slast = fun(n - 2);
		
		return last + slast;
	}  // TC : O(2^N)  Exponential in Nature

}
