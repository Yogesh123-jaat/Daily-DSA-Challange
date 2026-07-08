package Sorting;

public class BubbleSortDesc {

	public static void main(String[] args)
	{
		int[] arr = {5,-3,5,0,-3,8,8,1};
		
		System.out.println("Before sorting : ");
		print(arr);
		
		bubbleSort(arr);  // best case T.C. : O(n) , Avg Worst Case T.C. : O(n^2)
		
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
	
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			boolean swapped = false;
			
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					swapped = true;
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped)
			{
				break;
			}
		}
	}
}
