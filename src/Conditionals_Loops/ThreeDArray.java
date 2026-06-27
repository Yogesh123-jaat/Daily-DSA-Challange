package Conditionals_Loops;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][][] arr = new int[3][2][5];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				for(int k = 0; k < arr[i][j].length; k++)
				{
					System.out.println("Enter Arr[" + i + "][" + j + "]["+ k +"] : ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				for(int k = 0; k < arr[i][j].length; k++)
				{
					System.out.println("Arr["+ i +"]["+ j +"]["+ k +"] : " + arr[i][j][k]);
				}
			}
		}
	}

}
