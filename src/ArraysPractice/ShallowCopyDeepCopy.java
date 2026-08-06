package ArraysPractice;

import java.util.Arrays;

public class ShallowCopyDeepCopy {

	public static void main(String[] args)
	{
		int[] arr = {10 , 20 , 30 , 40};
		
		int[] brr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			brr[i] = arr[i];   // deep copy
		}
		
		brr[0] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		
		int[] x = arr;  // shallow copy
		
		x[0] = 100;
		
		System.out.println(arr[0]);
		
		
		int[] y = Arrays.copyOf(arr , arr.length);  // Deep Copy
		
		y[0] = 200;
		
		System.out.println(arr[0]);
		System.out.println(y[0]);
	}
}