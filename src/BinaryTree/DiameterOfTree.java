package BinaryTree;

public class DiameterOfTree 
{
	public static void main(String[] args) 
	{
		
	}
	static int max;
    public int diameter(Node root) 
    {
        max = 0;
        levels(root);
        return max;
    }
    
    int levels(Node root)
    {
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        
        max = Math.max(max , (leftLevel + rightLevel));
        
        return 1 + Math.max(leftLevel , rightLevel);
    }
}
