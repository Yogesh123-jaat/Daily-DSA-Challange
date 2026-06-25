package Conditionals_Loops;

import java.util.Scanner;

public class CheckAmg {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		if(isAmg(num))
		{
			System.out.println(num + " is Armstrong");
		}
		else
		{
			System.out.println(num + " is not Armstrong");
		}
		
	}
	
	public static boolean isAmg(int num)
	{
		int count = 0;
		int dup = num;
		int amg = 0;
		
		while(dup > 0)
		{
			count++;
			dup /= 10;
		}
		
		dup = num;
		
		while(dup > 0)
		{
			int r = dup % 10;
			amg = amg + (int)Math.pow(r , count);
			dup /= 10;
		}
		
		return num == amg;
		
	} // Time complexity : O(log10(N) + 1)

}
