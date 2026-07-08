package Sorting;

public class FindKthSmallest {

	public static void main(String[] args)
	{
		int[] arr = {7,10,4,3,20,15};
		int k = 3;
		
		System.out.println(kthSmallest(arr , k));
	}
	
	public static int kthSmallest(int[] arr , int k)
	{
		int n = arr.length;
		
		for(int i = 0; i < k; i++)
		{
			int minIdx = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[j] < arr[minIdx])
				{
					minIdx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		
		return arr[k-1];
	}

}
