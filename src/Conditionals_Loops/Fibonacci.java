package Conditionals_Loops;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = 0 , b = 1, c , n;
		
		System.out.println("Enter the number of terms : ");
		n = sc.nextInt();
		
		System.out.print(a + " " + b);
		
		for(int i = 3; i <= n; i++)
		{
			c = a + b;
			
			System.out.print(" " + c);
			
			a = b;
			b = c;
		}
	}
}