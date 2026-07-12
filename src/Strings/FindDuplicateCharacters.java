package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateCharacters {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		bruteForce(s);
		better(s);
		System.out.println();
		optimal(s);
	}
	
	public static void bruteForce(String s)
	{
		if(s == null || s.isEmpty()) return;
		
		char[] arr = s.toCharArray();
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == '0' || arr[i] == ' ') continue;
			
			int count = 1;
			
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					arr[j] = '0';
				}
			}
			
			if(count > 1)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
	}
	
	public static void better(String s)
	{
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				System.out.print(arr[i] + " ");
				
				while(i < arr.length - 1 && arr[i] == arr[i+1])
				{
					i++;
				}
			}
		}
	}
	
	public static void optimal(String s)
	{
		if(s == null || s.isEmpty()) return;
		
		int[] count = new int[256];
		
		for(int i = 0; i < s.length(); i++)
		{
			count[s.charAt(i)]++;
		}
		
		for(int i = 0; i < 256; i++)
		{
			if(count[i] > 1)
			{
				System.out.print((char)i + " ");
			}
		}
	}

}
