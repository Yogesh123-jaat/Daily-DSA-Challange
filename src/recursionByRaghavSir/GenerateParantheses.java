package recursionByRaghavSir;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses 
{
	public static void main(String[] args) 
	{
		System.out.println(generateParenthesis(3));
	}
	
	public static void generate(int n , int l , int r , String s , List<String> list)
    {
        if(s.length() == 2*n)  // r == n
        {
            list.add(s);
            return;
        }
        if(l < n) generate(n, l+1 , r , s+"(" , list);
        if(r < l) generate(n , l , r+1 , s+")" , list);
    }
    public static List<String> generateParenthesis(int n) 
    {
        ArrayList<String> list = new ArrayList<>();
        generate(n,0,0,"",list);

        return list;    
    }
}
