package Recursion;

import java.util.Scanner;

public class SumFirstNNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		sum(n , 0);
	}
	
	public static void sum(int i , int sum)
	{
		if(i < 1)
		{
			System.out.println(sum);
			return;
		}
		sum(i - 1 , sum + i);
	}

}
