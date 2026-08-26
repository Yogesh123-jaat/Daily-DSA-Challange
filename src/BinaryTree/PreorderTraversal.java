package BinaryTree;

import java.util.ArrayList;

public class PreorderTraversal 
{
	public static void main(String[] args) 
	{
		
	}
	public static void dfs(Node root , ArrayList<Integer> ans)
    {
        if(root == null) return;
        ans.add(root.val);
        dfs(root.left , ans);
        dfs(root.right , ans);
    }
    public static ArrayList<Integer> preOrder(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root , ans);
        return ans;
    }
}
