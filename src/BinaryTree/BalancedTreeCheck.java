package BinaryTree;

public class BalancedTreeCheck 
{
	public static void main(String[] args) 
	{
		
	}
	// public boolean isBalanced(Node root) 
    // {
    //     if(root == null) return true;
        
    //     int leftLevel = levels(root.left);
    //     int rightLevel = levels(root.right);
        
    //     if(Math.abs(leftLevel - rightLevel) > 1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    
    // public int levels(Node root)
    // {
    //     if(root == null) return 0;
    //     return 1 + Math.max(levels(root.left) , levels(root.right));
    // }
    
    static boolean flag;
    public static boolean isBalanced(Node root) 
    {
        if(root == null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    
    public static int levels(Node root)
    {
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        if(Math.abs(leftLevel - rightLevel) > 1) flag = false;
        return 1 + Math.max(leftLevel , rightLevel);
    }
}
