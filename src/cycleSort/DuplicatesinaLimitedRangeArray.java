package cycleSort;

import java.util.ArrayList;

public class DuplicatesinaLimitedRangeArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,1,2,3};
		
		System.out.println(findDuplicate(arr));
	}
	
	public static ArrayList<Integer> findDuplicate(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<>();
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
			if(arr[i] != i+1) list.add(arr[i]);
		}
		return list;
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
