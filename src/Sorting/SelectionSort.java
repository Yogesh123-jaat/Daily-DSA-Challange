package Sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int[] arr = {5,-3,5,0,-3,8,8,1};
		
		System.out.println("Before sorting : ");
		print(arr);
		
		selectionSort(arr); // Best Avg Worst TC : O(n^2)
		
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
	
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			int minIdx = i;
			for(int j = i + 1; j < n; j++)
			{
				if(arr[j] < arr[minIdx])
				{
					minIdx = j;
				}
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

}
