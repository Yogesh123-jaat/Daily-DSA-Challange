package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class Pair
//{
//	Node node;
//    int level;
//
//   Pair(Node node , int level)
//   {
//       this.node = node;
//       this.level = level;
//   }
//}

public class BinaryTreeLevelOrderTraversal102L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public List<List<Integer>> levelOrder(Node root) 
    {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        ArrayList<Integer> sarr = new ArrayList<>();

        if(root == null) return arr;
        
        Queue<Pair> q = new LinkedList<>(); 
        q.add(new Pair(root , 0));  
        int currLevel = 0;
        while(q.size() > 0)
        {
            Pair front = q.remove();
            if(front.level != currLevel)
            {
                arr.add(new ArrayList<>(sarr));
                sarr.clear();
                currLevel++;
            }
            sarr.add(front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left , front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right , front.level+1));
        }
        arr.add(new ArrayList<>(sarr));

        return arr;
    }
}
