package TwoDArray;

public class RotateArray90 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{2,8,3,4} , {7,2,1,6} , {5,5,4,1} , {3,1,8,2}};
		
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println();
		
		for(int[] a : arr)
		{
			for(int ele : a)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int stCol = 0;
			int endCol = arr.length - 1;
			
			while(stCol < endCol)
			{
				int temp = arr[i][stCol];
				arr[i][stCol] = arr[i][endCol];
				arr[i][endCol] = temp;
				
				stCol++;
				endCol--;
			}
		}
		
		
		System.out.println();
		
		for(int[] a : arr)
		{
			for(int ele : a)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}
