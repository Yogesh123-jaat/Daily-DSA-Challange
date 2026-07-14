package binarySearch;

import java.util.Arrays;

public class FirstAndLastOccurence {

	public static void main(String[] args)
	{
		int[] arr = {1,1,2,2,2,3,5,5,5,6,7,8,11};
		int target = 5;
		
		int[] nums = firstLast(arr , target);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static int[] firstLast(int[] arr , int target)
	{
		int idx1 = -1;
        int idx2 = -1;
        for(int i = 0; i < 2; i++)
        {
            int start = 0;
            int end = arr.length - 1;

            while(start <= end)
            {
            	int mid = start + (end - start)/2;

            	if(target > arr[mid]) start = mid + 1;
            	else if(target < arr[mid]) end = mid - 1;
            	else if(target == arr[mid] && i == 0) 
            	{
            		idx1 = mid;
            		end = mid - 1;
            	}
            	else if(target == arr[mid] && i == 1)
            	{
            		idx2 = mid;
            		start = mid + 1;
            	}
            }   
        } 

        return new int[]{idx1 , idx2};
	}

}
