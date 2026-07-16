package binarySearch;

public class KthMissingPositiveNumberinaSortedArray 
{
	public static void main(String[] args)
	{
		int[] arr = {2, 3, 4, 7, 11};
		int k = 5;
		
		System.out.println(search(arr , k));
	}

	public static int search(int[] arr , int k)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			int correctNo = mid + 1;
			
			int missing = arr[mid] - correctNo;
			
			if(missing >= k) end = mid - 1;
			else start = mid + 1;
		}
		
		return end + 1 + k;
	}
}
