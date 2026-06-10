package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {12,15,65,47,85,96,32,19};
		
		System.out.println(Arrays.toString(arr));
		
		reverse(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(int[] arr)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end)
		{
			swap(arr , start , end);
			start++;
			end--;
		}
	}
	
	static void swap(int[] arr , int idx1 , int idx2)
	{
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
