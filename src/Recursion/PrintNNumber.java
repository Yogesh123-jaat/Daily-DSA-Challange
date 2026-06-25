package Recursion;

import java.util.Scanner;

public class PrintNNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		fun(1 , n);
	}
	
	public static void fun(int i , int n)
	{
		if(i > n)
		{
			return;
		}
		System.out.println(i);
		fun(i+1 , n);
	}  // TC : O(N) SC : O(N)


}
