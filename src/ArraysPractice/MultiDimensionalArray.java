package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][3];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.println("Enter the A["+ i +"]["+ j +"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int  i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
		
		for(int[] arr : a)
		{
			System.out.println(Arrays.toString(arr));
		}
	}

}
