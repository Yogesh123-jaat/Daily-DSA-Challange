package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {

	public static void main(String[] args)
	{
		int[] arr = {10 , 20 , 30 , 40};
		
		int[] brr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			brr[i] = arr[i];
		}
		
		// brr is also deep copy
		
		int[] x = arr;  // shallow copy : dusre array me change karne par first array me bhi change hota hai.
		
		x[0] = 100;
		
		System.out.println(arr[0]);
		
		int[] y = Arrays.copyOf(arr , arr.length);   // Deep Copy : Isme second array me change kare to first array me change nahi hota hai.
		
		y[0] = 200;
		System.out.println(y[0]);
		System.out.println(arr[0]);
	}

}
