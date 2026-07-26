package recursionByRaghavSir;

public class firstOccurenceInBSByRecur 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,15,25,34,45,56,68,75,85};
		int target = 35;
		System.out.println(search(arr , target));
	}
	
	public static int helper(int[] arr , int target , int start , int end)
	{
		if(start > end) return end;
		int mid = start + (end - start)/2;
		
		if(arr[mid] == target) return mid;
		else if(target < arr[mid]) return helper(arr , target , start , mid - 1);
		else return helper(arr , target , mid + 1 , end);
		
	}
	
	public static int search(int[] arr , int target)
	{
		int n = arr.length;
		return helper(arr , target , 0 , n-1);
	}
}
