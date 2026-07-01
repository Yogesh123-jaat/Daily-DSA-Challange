package ArraysPractice;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {12,15,65,48,75,96};
		
		System.out.println("Enter the start index : ");
		int idx1 = sc.nextInt();
		
		System.out.println("Enter the end index : ");
		int idx2 = sc.nextInt();
		
		System.out.println(max(arr));
		
		System.out.println(maxRange(arr , idx1 , idx2));
	}
	
	static int max(int[] arr)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		int maxVal = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(maxVal < arr[i])
			{
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	static int maxRange(int[] arr , int start , int end)
	{
		if(arr == null || arr.length == 0)
		{
			return -1;
		}
		
		if(start < 0 || end >= arr.length || start > end)
		{
			System.out.println("Invalid range entered");
			return -1;
		}
		
		int maxVal = arr[start];
		
		for(int i = start; i <= end; i++)
		{
			if(maxVal < arr[i])
			{
				maxVal = arr[i];
			}
		}
		
		return maxVal;
	}

}
