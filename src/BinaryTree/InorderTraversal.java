package BinaryTree;

import java.util.ArrayList;

public class InorderTraversal 
{
	public static void main(String[] args) 
	{
		
	}
	public static void dfs(Node root , ArrayList<Integer> ans)
    {
        if(root == null) return;
        dfs(root.left , ans);
        ans.add(root.val);
        dfs(root.right , ans);
    }
    public static ArrayList<Integer> inOrder(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root , ans);
        return ans;
    }
}
