package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,18,12,65,45,25,96};
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Enter the idx1 : ");
		int idx1 = sc.nextInt();
		
		System.out.println("Enter the idx2 : ");
		int idx2 = sc.nextInt();
		
		swap(arr , idx1 , idx2);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr , int idx1 , int idx2)
	{
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
