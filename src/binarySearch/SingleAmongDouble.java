package binarySearch;

public class SingleAmongDouble 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		
		System.out.println(search(arr));
	}
	
	public static int search(int[] arr)
	{
		int n = arr.length;
		
		if(n == 1) return arr[0];
		if(arr[0] != arr[1]) return arr[0];
		if(arr[n - 1] != arr[n - 2]) return arr[n-1];
		
		int start = 0;
		int end = n - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) return arr[mid];
			
			int f = mid;
			int s = mid;
			
			if(arr[mid] == arr[mid + 1]) s = mid + 1;
			else f = mid - 1;
			
			int leftCount = f - start;
			int rightCount = end - s;
			
			if(leftCount % 2 == 0) start = s + 1;
			else end = f - 1;
				
		}
		
		return -1;
	}
}
