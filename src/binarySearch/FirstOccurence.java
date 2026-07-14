package binarySearch;

public class FirstOccurence {

	public static void main(String[] args)
	{
		int[] arr = {1,1,2,2,2,3,5,5,5,6,7,8,11};
		int target = 4;
		
		System.out.println(binaryFirst(arr , target));
	}
	
	public static int binaryFirst(int[] arr , int target)
	{
		int start = 0;
		int end = arr.length - 1;
		int idx = -1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(target > arr[mid]) start = mid + 1;
			else if(target < arr[mid]) end = mid - 1;
			else if(target == arr[mid])
			{
				idx = mid;
				end = mid - 1;
			}
		}
		
		return idx;
	}
}
