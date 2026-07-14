package binarySearch;

public class FloorInSortedArray {

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 8, 10, 10, 12, 19};
		int x = 11;
		
		System.out.println(floor(arr , x));
	}
	
	public static int floor(int[] arr , int x)
	{
		int idx = -1;
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(arr[mid] > x) end = mid - 1;
			else if(arr[mid] <= x) 
			{
				idx = mid;
				start = mid + 1;
			}
		}
		
		return idx;
	}

}
