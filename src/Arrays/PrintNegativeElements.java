package Arrays;

import java.util.Scanner;

public class PrintNegativeElements {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
