package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MUltipleCatchBlocks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int idx = -1;
		
		try
		{
			for(int i = 0; i < arr.length; i++)
			{
				System.out.println("Enter the Arr[" + i + "] : ");
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Input done");
			
			System.out.println("Enter the index : ");
			idx = sc.nextInt();
			
			System.out.println("Element at the index is : " + arr[idx]);
			
			System.out.println("Hello");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong index : " + e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input only integer : " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Any type of exception : " + e.getMessage());
		}
		
		System.out.println("Program runs safely.");
		
	}
}
