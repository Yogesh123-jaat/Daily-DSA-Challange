package ArraysPractice;

public class EvenDigitInArray {

	public static void main(String[] args) 
	{
		int[] nums = {12,345,2,6,7896,1234};
		
		
		System.out.println(findNumbers(nums));
	}
	
	static int findNumbers(int[] nums)
	{
		int count = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(even(nums[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	
	
	static boolean even(int num)
	{
		int numberOfDigits = digits(num);
		
		return numberOfDigits % 2 == 0;
	}
	
	static int digits(int digit)
	{
		if(digit < 0)
		{
			digit = digit * -1;
		}
		
		if(digit == 0)
		{
			return 1;
		}
		
		int count = 0;
		
		while(digit > 0)
		{
			count++;
			digit /= 10;
		}
		
		return count;
	}

}
