package TwoDArray;

public class FindMinEleMaxRow 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4},{7,1,1,1},{8,2,2,2}};
		int min = Integer.MAX_VALUE;
		int max = arr[0][0];
		
		for(int i = 0; i < arr.length; i++)
		{
			//int max = arr[i][0];
			for(int j = 0; j < arr[i].length; j++)
			{
				if(max < arr[i][j])
				{
					max = arr[i][j];
				}
			}
			System.out.println(max);
			if(min > max)
			{
				min = max;
			}
		}
		
		System.out.println(min);
	}
}
