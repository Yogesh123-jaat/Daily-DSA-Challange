package Arrays;

public class MissingInArray {

	public static void main(String[] args) 
	{
		int[] arr = {3 , 2 , 1 , 4 , 5 , 8 ,  7};
		
		int n = arr.length + 1;
		
		int sum = (n * (n+1))/2;
		int sumArray = 0;
		
		for(int ele : arr)
		{
			sumArray += ele;
		}
		
		System.out.println(sum - sumArray);
		
		
	}

}
