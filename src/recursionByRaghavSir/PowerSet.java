package recursionByRaghavSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		List<String> list = new ArrayList<>();
		
		subsets("" , s , 0 , list);
		
		 Collections.sort(list);
		
		System.out.println(list);
	}
	
	public static void subsets(String ans , String s , int idx , List<String> list)
	{
		if(idx == s.length())
		{
			if(!ans.isBlank())
				list.add(ans);
			return;
		}
		char ch = s.charAt(idx);
		
		subsets(ans+ch , s , idx+1 , list);
		subsets(ans , s , idx+1 , list);
	}
}
