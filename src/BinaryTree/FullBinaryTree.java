package BinaryTree;

public class FullBinaryTree 
{
	public static void main(String[] args) 
	{
		
	}
	
	public boolean isFullTree(Node root) 
    {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;    
        if(root.left == null || root.right == null) return false;
        
        
        return isFullTree(root.left) && isFullTree(root.right);
    }
}
