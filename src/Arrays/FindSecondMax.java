package Arrays;

import java.util.Scanner;

public class FindSecondMax {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {4 , 10 , 10 , 6 , 3 , 8};
		
		int max = arr[0];
		int smax = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(smax < arr[i] && max != arr[i])
			{
				smax = arr[i];
			}
		}
		
		System.out.println("Max : " + max);
		System.out.println("Smax : " + smax);
		
		
	}

}
