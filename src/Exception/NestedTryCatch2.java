package Exception;

import java.util.Scanner;

public class NestedTryCatch2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix = {{1,2},{3,4}};
		
		try
		{
			System.out.println("Enter the row index : ");
			int rowIdx = sc.nextInt();
			
			for(int i = 0; i < matrix[rowIdx].length; i++)
			{
				System.out.print(matrix[rowIdx][i] + " ");
			}
			
			System.out.println();
			
			try
			{
				System.out.println("Enter the column index : ");
				int colIdx = sc.nextInt();
				
				System.out.println("Entre the divisor : ");
				int num = sc.nextInt();
				
				System.out.println("After divide : " + matrix[rowIdx][colIdx]/num);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inner : Divide by zero - " + e.getMessage());
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("wrong Index entered : " + e.getMessage());
		}
		
		System.out.println("Program runs safely");
	}
}
