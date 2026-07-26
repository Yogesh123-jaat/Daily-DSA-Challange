package recursionByRaghavSir;

public class LinearSearchByRecur 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,15,34,89,56,25,68,75,12,45,85};
		
		int ele = 56;
		
		System.out.println(exists(arr , ele , 0));
	}
	
	public static boolean exists(int[] arr , int ele , int idx)
	{
		if(idx == arr.length) return false;
		if(arr[idx] == ele) return true;
		
		return exists(arr , ele , idx+1);
	}
}
