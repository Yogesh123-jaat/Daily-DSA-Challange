package Arrays;

public class TwoSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {21,7,11,15,2,25,6};
		
		int target = 9;
		
		System.out.println(findTarget(arr , target));
	}
	
	public static boolean findTarget(int[] arr , int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
