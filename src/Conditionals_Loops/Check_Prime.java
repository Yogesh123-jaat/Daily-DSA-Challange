package Conditionals_Loops;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i,num,flag = 1;
		
		System.out.println("Enter the num : ");
		num = sc.nextInt();
		
		for(i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println(num + " is prime");
		}
		else
		{
			System.out.println(num + " is not prime");
		}

	}

}
