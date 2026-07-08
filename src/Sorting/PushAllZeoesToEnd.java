package Sorting;

public class PushAllZeoesToEnd {

	public static void main(String[] args)
	{
		int[] arr = {1,0,-2,3,0,4,8,0,10,12};
		
		int n = arr.length;
		int j = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] != 0)
			{
				if(i != 0)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}

}
