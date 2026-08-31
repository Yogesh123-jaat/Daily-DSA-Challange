package BinaryTree;

import javax.swing.tree.TreeNode;

public class SymmetricTree 
{
	public static void main(String[] args) 
	{
		
	}	
	public static boolean isSymmetric(Node root)
    {
        mirror(root.left);
        return isSameTree(root.left , root.right);
    }
    public static boolean isSameTree(Node p , Node q)
    {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
    public static void mirror(Node root)
    {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
