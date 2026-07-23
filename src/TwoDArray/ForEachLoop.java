package TwoDArray;

public class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4},{7,1,1,1},{8,2,2,2}};
		
		
		for(int[] a : arr)
		{
			for(int ele : a)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int ele : arr[i])
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}
