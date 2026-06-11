package Arrays;

public class FindMinInArray 
{
	public static void main(String[] args) 
	{
		int arr[][] = new int[][] {
			{25,65,14,63},
			{17,89,52,45},
			{12,32},
			{56,99,78}
		};
		
		System.out.println(min(arr));
	}
	
	static int min(int[][] arr)
	{
		int min = arr[0][0];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(min > arr[i][j])
				{
					min = arr[i][j];
				}
			}
		}
		
		return min;
	}

}
