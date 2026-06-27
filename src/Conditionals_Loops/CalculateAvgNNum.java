package Conditionals_Loops;

import java.util.Scanner;

public class CalculateAvgNNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the n number which you want to calculate avg : ");
		n = sc.nextInt();
		
		if(n <= 0)
		{
			System.out.println("Please enter valid count greater than 0");
		}
		else
		{
			double avg = CalcAvg(n);
			System.out.println("The Average of these " + n + " numbers : " + avg);
		}
	}
	
	public static double CalcAvg(int n)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Enter the " + i + " number : ");
			int num = sc.nextInt();
			sum += num;
		}
		
		return sum/n;
	}

}
