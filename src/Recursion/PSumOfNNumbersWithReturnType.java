package Recursion;

import java.util.Scanner;

public class PSumOfNNumbersWithReturnType 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		System.out.println(fun(n));
	}
	
	public static int fun(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		
		return n + fun(n - 1);
	}
}