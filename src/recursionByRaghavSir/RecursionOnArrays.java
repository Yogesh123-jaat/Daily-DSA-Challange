package recursionByRaghavSir;

public class RecursionOnArrays 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,15,34,89,56,25,68,75,12,45,85};
		
		recPrint(arr , 0);
	}
	
	public static void recPrint(int[] arr , int idx)
	{
		if(idx == arr.length) return;
//		System.out.print(arr[idx] + " ");
		recPrint(arr , idx+1);
		System.out.print(arr[idx] + " ");  // reverse print ke liye
	}
}
