package TwoDArray;

public class MinimumEleOutOfAllMaxEle {

	public static void main(String[] args) 
	{
		//int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
		int[][] arr = {{1,2,3,4},{7,1,1,1},{8,2,2,2}};
		int maxRow = -1;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			maxRow = Integer.MIN_VALUE;
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] > maxRow)
				{
					maxRow = arr[i][j];
				}
			}
			if(min > maxRow)
			{
				min = maxRow;
			}
		
		}
		
		System.out.println(min);
	}

}
