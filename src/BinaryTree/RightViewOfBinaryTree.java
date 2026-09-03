package BinaryTree;

import java.util.ArrayList;

public class RightViewOfBinaryTree
{
	public static void main(String[] args) 
	{
		
	}
	public static ArrayList<Integer> rightView(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root , 0 , ans);
        return ans;
    }
    
    public static void view(Node root , int level , ArrayList<Integer> ans)
    {
        if(root == null) return;
        
        if(level >= ans.size()) ans.add(root.val);
        else ans.set(level , root.val);
        
        view(root.left , level + 1 , ans);
        view(root.right , level + 1 , ans);
    }
}
