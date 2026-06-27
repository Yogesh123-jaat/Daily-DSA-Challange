package Conditionals_Loops;

import java.util.Scanner;

public class AmgRange {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number : ");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending number : ");
		int end = sc.nextInt();
		
		Amg(start , end);
	}
	
	public static void Amg(int start , int end)
	{
		int num , count = 0 , amg , temp;
		
		for(int i = start; i <= end; i++)
		{
			num = i;
			amg = 0;
			count = 0;
			
			while(num > 0)
			{
				count++;
				num /= 10;
			}
			
			num = i;
			
			while(num > 0)
			{
				temp = num % 10;
				amg = amg + (int)Math.pow(temp , count);
				num /= 10;
			}
			
			if(amg == i)
			{
				System.out.print(i + " ");
			}
		}
		
	}

}
