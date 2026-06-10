package functions_methods;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start num : ");
		int start = sc.nextInt();
		
		System.out.println("Enter the	 end num : ");
		int end = sc.nextInt();
		
		prime(start , end);
	}
	
	static void prime(int start , int end)
	{
		for(int i = start; i <= end; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		for(int i = 2; i * i <= n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
