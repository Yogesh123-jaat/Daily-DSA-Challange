package ArraysPractice;

import java.util.Arrays;

public class SearchIn2DArray 
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][] {
			{23,45,68},
			{12,63,25,96},
			{78,99,56,42,49},
			{89,54,36,65,78}
		};
		
		int target = 56;
		
		int ans[] = search(arr , target);
		
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] search(int[][] arr , int target)
	{
		if(arr.length == 0)
		{
			return new int[] {-1 , -1};
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(target == arr[i][j])
				{
					return new int[] {i , j};
				}
			}
		}
		
		return new int[] {-1 , -1};
	}

}
