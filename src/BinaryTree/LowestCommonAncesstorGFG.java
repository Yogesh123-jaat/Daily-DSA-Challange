package BinaryTree;

public class LowestCommonAncesstorGFG 
{
	public static void main(String[] args) 
	{
		
	}
	Node lca(Node root, int p , int q) 
    {
        if(root == null) return null;
        
        if(root.val == p || root.val == q) return root;
        boolean pLiesInLeft = exists(root.left , p);
        boolean qLiesInLeft = exists(root.left , q);
        if(pLiesInLeft && qLiesInLeft) return lca(root.left , p , q);
        else if(!pLiesInLeft && !qLiesInLeft) return lca(root.right , p , q);
        else return root;
    }
    
    boolean exists(Node root , int val)
    {
        if(root == null) return false;
        if(root.val == val) return true;
        return exists(root.left , val) || exists(root.right , val);
    }
}
