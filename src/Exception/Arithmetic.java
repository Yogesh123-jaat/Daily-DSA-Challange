package Exception;

import java.util.Scanner;

public class Arithmetic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		int div = 1;
		
		try
		{
			div = num1 / num2;
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("Error aaya: " + e.getMessage());
		}
		
		System.out.println("Division is : " + div);
	}
}
