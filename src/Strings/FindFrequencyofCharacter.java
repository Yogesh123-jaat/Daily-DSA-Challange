package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class FindFrequencyofCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		printFrequencyBruteForce(s);
		printFrequencyBetter(s);
		printFrequencyOptimal(s);
	}
	
	public static void printFrequencyBruteForce(String s)
	{
	    if (s == null || s.isEmpty()) return;

	    char[] arr = s.toCharArray();
	    int n = arr.length;

	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] == '0') continue;

	        int count = 1;
	        for (int j = i + 1; j < n; j++) 
	        {
	            if (arr[i] == arr[j]) 
	            {
	                count++;
	                arr[j] = '0'; 
	            }
	        }
	        System.out.println(arr[i] + " : " + count);
	    }
	    
	    System.out.println();
	}
	

	public static void printFrequencyBetter(String s) 
	{
	    if (s == null || s.isEmpty()) return;

	    char[] arr = s.toCharArray();
	    Arrays.sort(arr); // Sort kiya -> O(n log n)

	    for (int i = 0; i < arr.length; i++)
	    {
	        int count = 1;
	        
	        // Jab tak padosi character same hai, count badhao
	        while (i < arr.length - 1 && arr[i] == arr[i + 1])
	        {
	            count++;
	            i++;
	        }
	        System.out.println(arr[i] + " : " + count);
	    }
	    
	    System.out.println();
	}
	
	public static void printFrequencyOptimal(String s)
	{
	    if (s == null || s.isEmpty()) return;

	    // ASCII ke liye fixed size array
	    int[] count = new int[256];

	    // Step 1: Ek hi baar loop chalaya aur frequency store kar li - O(n)
	    for (int i = 0; i < s.length(); i++) 
	    {
	        count[s.charAt(i)]++;
	    }

	    // Step 2: Ab pure 256 array par loop chalao aur print karo - O(1)
	    for (int i = 0; i < 256; i++)
	    {
	        // Agar frequency 0 se zyada hai, matlab woh character string mein tha!
	        if (count[i] > 0) 
	        {
	            // (char)i se wapas character ka chehra mila, aur count[i] se ginti mili
	            System.out.println((char)i + " : " + count[i]);
	        }
	    }
	}
}
