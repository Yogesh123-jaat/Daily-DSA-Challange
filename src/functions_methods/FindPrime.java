package functions_methods;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		
		checkPrime(num);
	}
	
	static void checkPrime(int num)
	{
		if(num <= 1)
		{
			System.out.println(num + " is not prime");
			return;
		}
		
		boolean flag = true;
		
		for(int i = 2; i * i <= num; i++)
		{
			if(num % i == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag == false)
		{
			System.out.println(num + " is not prime");
		}
		else
		{
			System.out.println(num + " is prime");
		}
	}

}
