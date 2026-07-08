package Sorting;

public class IsArraySorted {

	public static void main(String[] args)
	{
		int[] arr = {1,0,2,3,4,5,6};
		
		System.out.println(isArraySort(arr));
	}

	public static boolean isArraySort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i+1]) return false;
		}
		return true;
	}
}
