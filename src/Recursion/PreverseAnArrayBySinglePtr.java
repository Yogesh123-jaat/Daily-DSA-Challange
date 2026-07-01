package Recursion;

import java.util.Arrays;

public class PreverseAnArrayBySinglePtr 
{
	public static void main(String[] args) 
	{
		int[] arr = {1 , 3 , 2 , 5 , 4};
		
		swap(0 , arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int i , int[] arr)
	{
		int n = arr.length;
		
		if(i >= n/2)
		{
			return;
		}
		
		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;
		
		swap(i+1 , arr);
	}
}