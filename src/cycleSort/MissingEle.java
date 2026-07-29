package cycleSort;

public class MissingEle 
{
	public static void main(String[] args) 
	{
		int[] arr = {7,8,5,4,2,1,3};
		
		System.out.println(missingNum(arr));
	}
	
	public static int missingNum(int[] arr)
	{
		int n = 1 + arr.length;
		
		int i = 0;
		while(i < arr.length)
		{
			if(arr[i] == i+1 || arr[i] == n) i++;
			else
			{
				int idx = arr[i] - 1;
				swap(arr , i , idx);
			}
		}
		
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] != i+1) return i+1;
		}
		return n;
	}
	
	public static void swap(int[] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
