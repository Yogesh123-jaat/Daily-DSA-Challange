package TwoDArray;

public class TransposeInNewMatrics 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
		
		int[][] brr = new int[arr[0].length][arr.length];
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[0].length; j++)
			{
				brr[i][j] = arr[j][i];
			}
		}
		
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[0].length; j++)
			{
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
