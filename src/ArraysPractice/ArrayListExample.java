package ArraysPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		
//		list.add(67);
//		list.add(89);
//		list.add(58);
//		list.add(45);
//		list.add(75);
//		list.add(23);
//		
//		System.out.println(list.contains(45666));
//		
//		System.out.println(list);
//		
//		list.set(0 , 99);
//		
//		System.out.println(list);
//		
//		list.remove(2);
//		
//		System.out.println(list);
		
		for(int i = 0; i < 5; i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
	}

}
