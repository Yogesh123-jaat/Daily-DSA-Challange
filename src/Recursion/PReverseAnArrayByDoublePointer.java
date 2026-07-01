package Recursion;

import java.util.Arrays;

public class PReverseAnArrayByDoublePointer
{
	public static void main(String[] args) 
	{
		int arr[] = {1 , 3 , 2 , 5 , 4};
		
		int l = 0;
		int r = arr.length - 1;
		
		swap(l , r , arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void swap(int l , int r , int[] arr)
	{
		if(l >= r)
		{
			return;
		}
		
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		
		swap((l+1) , (r-1) , arr);
	}

}
