package BinaryTree;

import java.util.ArrayList;

public class LeftViewOfBinaryTree 
{
	public static void main(String[] args) 
	{
		
	}
	
	public ArrayList<Integer> leftView(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root , 0 , ans);
        return ans;
    }
    
    public void view(Node root , int level , ArrayList<Integer> ans)
    {
        if(root == null) return;

        if(level >= ans.size()) ans.add(root.val);
        else ans.set(level , root.val);

        view(root.right , level + 1 , ans);
        view(root.left , level + 1 , ans);
    }
}
