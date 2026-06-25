package Conditionals_Loops;

import java.util.Scanner;

public class PrintAllDivisorsOptimalApproach {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int N = sc.nextInt();
		
		for(int i = 1; i * i <= N; i++)
		{
			if(N % i == 0)
			{
				System.out.print(i + " ");
				if((N / i) != i)
				{
					System.out.print(N/i + " ");
				}
			}	
		}  // Time Complexity : O(sqrt(N))
	}

}
