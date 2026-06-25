package Conditionals_Loops;

import java.util.Scanner;

public class CheckPrimeOptimalApproach {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		for(int i = 1; i * i <= num; i++)
		{
			if(num % i == 0)
			{
				count++;
				if((num / i) != i)
				{
					count++;
				}
			}
		}
		
		if(count == 2)
		{
			System.out.println(num + " is prime number");
		}
		else
		{
			System.out.println(num + " is not prime number");
		}
	}  // Time complexity : O(sqrt(N))

}
