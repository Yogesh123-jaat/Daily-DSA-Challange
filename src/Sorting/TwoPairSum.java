package Sorting;

import java.util.Arrays;

public class TwoPairSum {

	public static void main(String[] args) 
	{
		int[] arr = {7,4,6,0,21,10,12};
		
		Arrays.sort(arr);
		int target = 9;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(targetFind(arr , target));
	}
	
	public static boolean targetFind(int[] arr , int target)
	{
		int i = 0;
		int j = arr.length - 1;
		while(i < j)
		{
			if(arr[i] + arr[j] == target) return true;
			else if(arr[i] + arr[j] > target) j--;
			else if(arr[i] + arr[j] < target) i++;
		}
		
		return false;
	}

}
