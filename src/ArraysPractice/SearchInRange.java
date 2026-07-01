package ArraysPractice;

import java.util.Scanner;

public class SearchInRange {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] nums = {12,15,46,89,25,36,45,18,95,64};
		
		System.out.println("Enter the starting index : ");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending index : ");
		int end = sc.nextInt();
		
		System.out.println("Enter the target : ");
		int target = sc.nextInt();
		
		int ans = linearSearch(nums , target , start , end);
		
		System.out.println(ans);
	}
	
	static int linearSearch(int[] arr , int target , int start , int end)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		for(int i = start; i <= end; i++)
		{
			if(target == arr[i])
			{
				return i;
			}
		}
		
		return -1;
	}

}
