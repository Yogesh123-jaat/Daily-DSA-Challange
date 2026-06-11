package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] nums = {12,15,46,89,25,36,45,18,95,64};
		
		System.out.println("Enter the target : ");
		int target = sc.nextInt();
		
		int ans = linearSearch(nums , target);
		
		System.out.println(ans);
	}
	
	static int linearSearch(int[] arr , int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		
		return -1;
	}

}
