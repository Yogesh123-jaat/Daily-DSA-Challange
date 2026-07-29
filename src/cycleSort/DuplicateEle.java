package cycleSort;

import java.util.Arrays;

public class DuplicateEle 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,2,2};
		
		System.out.println(findDuplicate(arr));
	}
	
	
	public static int findDuplicate(int[] arr)
	{
		int n = arr.length;
		int i = 0;
		while(i < n)
		{
			int correctIdx = arr[i] - 1;
			
			if(arr[i] != arr[correctIdx])
			{
				swap(arr , i , correctIdx);
			}
			else
			{
				i++;
			}
		}
		
		for(i = 0; i < n; i++)
		{
			if(arr[i] != i+1) return arr[i];
		}
		return -1;
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}