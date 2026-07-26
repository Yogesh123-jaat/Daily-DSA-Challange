package recursionByRaghavSir;

import java.util.Arrays;

public class ReverseAnArrayByRecursion 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,15,25,34,45,56,68,75,85};
		
		int n = arr.length - 1;
		reverse(arr , 0 , n);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int[] arr , int idx , int n)
	{
		if(idx == n) return;
		
		int temp = arr[idx];
		arr[idx] = arr[n];
		arr[n] = temp;
		
		reverse(arr , idx+1 , n-1);
	}
}
