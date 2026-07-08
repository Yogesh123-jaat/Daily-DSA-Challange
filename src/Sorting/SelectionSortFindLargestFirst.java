package Sorting;

public class SelectionSortFindLargestFirst {

	public static void main(String[] args) 
	{
		int[] arr = {8,4,1,9,-3,6,5};
		
		System.out.println("Before sorting : ");
		print(arr);
		
		sort(arr);
		
		System.out.println("After Sorting : ");
		print(arr);
	}
	
	public static void print(int[] arr)
	{
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
	public static void sort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = n-1; i >= 0; i--)
		{
			int maxIdx = i;
			for(int j = i-1; j >= 0; j--)
			{
				if(arr[j] > arr[maxIdx])
				{
					maxIdx = j;
				}
			}
			
			int temp = arr[maxIdx];
			arr[maxIdx] = arr[i];
			arr[i] = temp;
		}
	}

}
