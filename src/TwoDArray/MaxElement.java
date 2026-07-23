package TwoDArray;

public class MaxElement 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4},{7,1,1,1},{8,2,2,2}};
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
		
		System.out.println("Max Element is : " + max);
	}
}
