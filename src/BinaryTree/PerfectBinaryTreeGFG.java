package BinaryTree;

public class PerfectBinaryTreeGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	static boolean isPerfect(Node root) 
    {
        int n = levels(root);
        int nOfNodes = size(root);
        
        return nOfNodes == (Math.pow(2,n) - 1);
    }
    
    static int levels(Node root)
    {
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left) , levels(root.right));
    }
    
    static int size(Node root)
    {
        if(root == null) return 0;
        
        return 1 + size(root.left) + size(root.right);
    }
}
