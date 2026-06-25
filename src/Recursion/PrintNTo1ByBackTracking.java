package Recursion;

import java.util.Scanner;

public class PrintNTo1ByBackTracking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		print(1 , n);
	}
	
	public static void print(int i , int n)
	{
		if(i > n)
		{
			return;
		}
		print(i + 1 , n);
		
		System.out.println(i);
	}

}
