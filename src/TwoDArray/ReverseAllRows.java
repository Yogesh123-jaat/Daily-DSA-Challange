package TwoDArray;

public class ReverseAllRows 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{2,8,3,4,7} , {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};
		
		for(int i = 0; i < arr.length; i++)
		{
			int stCol = 0; 
			int endCol = arr[i].length - 1;
			
			while(stCol < endCol)
			{
				int temp = arr[i][stCol];
				arr[i][stCol] = arr[i][endCol];
				arr[i][endCol] = temp;
				
				stCol++;
				endCol--;
			}
		}
		
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
