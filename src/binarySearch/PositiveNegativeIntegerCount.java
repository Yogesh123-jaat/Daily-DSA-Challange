package binarySearch;

public class PositiveNegativeIntegerCount 
{
	public static void main(String[] args) 
	{
		int[] nums = {-2,-1,-1,1,2,3,4};
		
		
		System.out.println(maximumCount(nums));
		
	}
	public static int maximumCount(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] >= 0)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        int negCount = start;
        start = 0;
        end = arr.length - 1;

         while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] <= 0)
            {
               start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }    

        int posCount = arr.length - start;

        if(posCount >= negCount) return posCount;
        else return negCount;
    }
}
