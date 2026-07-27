package recursionByRaghavSir;

import java.util.Arrays;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,5,2,4,6,7,1,3};
		
		MergeSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}	
	
	public static void MergeSort(int[] arr)
	{
		int n = arr.length;
		
		if(n == 1) return;
		
		// step 1: create 2 new empty arrays of size n/2 each
		
		int[] a = new int[n/2];
		int[] b = new int[n - n/2];
		
		// Step 2: Copy-paste arr into a and b
		
		int idx = 0;
		
		for(int i = 0; i < a.length; i++) 
			a[i] = arr[idx++];
		
		for(int i = 0; i < b.length; i++)
			b[i] = arr[idx++];
		
		// step 3 : magic
		
		MergeSort(a);
		MergeSort(b);
		
		// step 4: Merge a and b into arr
		
		merge(a , b , arr);
 	}
	
	public static void merge(int[] a , int[] b , int[] c)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				c[k++] = a[i++];
			}
			else
			{
				c[k++] = b[j++];
			}
		}
		
		while(j < b.length)
		{
			c[k++] = b[j++];
		}
		
		while(i < a.length)
		{
			c[k++] = a[i++];
		} // T. C : O(nlogn) S.C : O(nlogn) 
	}
}
