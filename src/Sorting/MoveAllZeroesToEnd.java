package Sorting;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) 
	{
		int[] arr = {1,0,-2,3,0,4,8,0,10,12};
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			boolean swapped = false;
			
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] == 0)
				{
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}

}
