package BinaryTree;

public class LowestCommonAncesstor236 
{
	public static void main(String[] args) 
	{
		
	}
	public Node lowestCommonAncestor(Node root, Node p, Node q) 
    {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        boolean pLiesInLeft = exists(root.left , p);
        boolean qLiesInLeft = exists(root.left , q);

        if(pLiesInLeft && qLiesInLeft) return lowestCommonAncestor(root.left, p, q);
        if(!pLiesInLeft && !qLiesInLeft) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

    public boolean exists(Node root , Node p)
    {
        if(root == null) return false;
        if(root.val == p.val) return true;
        return exists(root.left , p) || exists(root.right , p);
    }
}
