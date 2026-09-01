package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal 
{
	public static void main(String[] args) 
	{
		
	}
	
	public ArrayList<Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0)
        {
            Node front = q.remove();
            arr.add(front.val);
            
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        
        return arr;
    }
}
