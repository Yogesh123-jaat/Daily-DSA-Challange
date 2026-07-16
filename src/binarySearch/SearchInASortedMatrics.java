package binarySearch;

public class SearchInASortedMatrics 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
		int target = 14;
		
		System.out.println(find(arr , target));
	}
	
	public static boolean find(int[][] arr , int target)
	{
		int rows = arr.length;
		int cols = arr[0].length;
		int start = 0;
		int end = rows * cols - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			int midRow = mid / cols;
			
			int midCol = mid % cols;
			
			if(arr[midRow][midCol] == target) return true;
			
			else if(target > arr[midRow][midCol]) start = mid + 1;
			else end = mid - 1;
		}
		
		return false;
	}
}
