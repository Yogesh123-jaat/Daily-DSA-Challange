package TwoDArray;

public class RowWithMaxSum {

	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4} , {9,8,7,6} , {6,5,4,2}};
		
		int maxSum = Integer.MIN_VALUE;
		int row = -1;
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
			}
			
			if(sum > maxSum)
			{
				maxSum = sum;
				row = i;
			}
		}
		System.out.println(maxSum + " " + row);
	}

}
