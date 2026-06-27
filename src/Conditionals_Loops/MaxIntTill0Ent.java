package Conditionals_Loops;

import java.util.Scanner;

public class MaxIntTill0Ent {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = 1 , max = Integer.MIN_VALUE;
		
		while(num != 0)
		{
			System.out.println("Enter the num : ");
			num = sc.nextInt();
			
			if(num != 0 && max < num)
			{
				max = num;
			}
		}
		
		if(max == Integer.MIN_VALUE)
		{
			System.out.println("No Value entered except 0");
		}
		else
		{
			System.out.println("Max num is : " + max);
		}
	}

}
