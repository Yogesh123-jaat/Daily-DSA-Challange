package TwoDArray;

public class ColumnWisePrint {

	public static void main(String[] args)
	{
		int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int j = 0; j < arr[0].length; j++)
		{
			for(int i = 0; i < arr.length; i++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
