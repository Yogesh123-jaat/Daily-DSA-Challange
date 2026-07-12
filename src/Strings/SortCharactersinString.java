package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersinString 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println(bruteForce(s));
		System.out.println(better(s));
		System.out.println(optimal(s));
	}
	
	public static String bruteForce(String s)
	{
		if(s == null || s.isEmpty()) return s;
		
		char[] arr = s.toCharArray();
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return new String(arr);
	}
	
	public static String better(String s)
	{
		if(s == null || s.isEmpty()) return s;
		
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		
		return new String(arr);
	}
	
	public static String optimal(String s)
	{
		if(s == null || s.isEmpty()) return s;
		
		int[] count = new int[256];
		
		for(int i = 0; i < s.length(); i++)
		{
			count[s.charAt(i)]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 256; i++)
		{
			while(count[i] > 0)
			{
				sb.append((char)i);
				count[i]--;
			}
		}
		
		return sb.toString();
	}
}

