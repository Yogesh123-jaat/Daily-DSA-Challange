package Arrays;

public class RotateArray {

	public static void main(String[] args) 
	{
		int[] arr = {13 , 15 , 11 , 25 , 45 ,58 , 47 , 89 ,36 , 69};
		int n = arr.length;
		
		int d = 4;
		
		d = d % n;
		
		reverse(arr , 0 , (d - 1));
		reverse(arr , d , (n - 1));
		reverse(arr , 0 , (n - 1));
		
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}
	
	public static void reverse(int[] arr , int i , int j)
	{
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
