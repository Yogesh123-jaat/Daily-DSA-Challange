package Arrays;

public class FindMaxIn2DArray {

	public static void main(String[] args) 
	{
		int arr[][] = new int[][] {
			{25,65,14,63},
			{17,89,52,45},
			{12,32},
			{56,99,78}
		};
		
		System.out.println(max(arr));
	}
	
	static int max(int[][] arr)
	{
		int max = arr[0][0];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(max < arr[i][j])
				{
					max = arr[i][j];
				}
			}
		}
		
		return max;
	}

}
