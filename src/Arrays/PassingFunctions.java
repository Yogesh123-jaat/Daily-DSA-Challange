package Arrays;

import java.util.Arrays;

public class PassingFunctions {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void change(int[] nums)
	{
		nums[0] = 99;
	}

}
