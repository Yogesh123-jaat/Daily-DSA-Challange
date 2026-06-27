package Conditionals_Loops;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}
		
		if(num == sum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not perfect number");
		}
	}

}
