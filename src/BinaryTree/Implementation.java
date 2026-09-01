package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int val;
	Node left;
	Node right;
	
	Node(int val)
	{
		this.val = val;
	}
}

class Pair
{
	Node node;
	int level;
	
	Pair(Node node , int level)
	{
		this.node = node;
		this.level = level;
	}
}

public class Implementation 
{
	public static void main(String[] args) 
	{
		//      3
      //      /   \
      //     4     2
      //   /   \ /   \
      // -1    1 6    9
		
		Node a = new Node(3);
		Node b = new Node(4);
		Node c = new Node(2);
		Node d = new Node(-1);
		Node e = new Node(0);
		Node f = new Node(6);
		Node g = new Node(9);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		
//		preOrder(a);
//		inOrder(a);
//		postOrder(a);
//		System.out.println();
//		System.out.println(size(a));
//		System.out.println(sum(a));
//		System.out.println(product(a));
//		System.out.println(productNonZero(a));
//		System.out.println(max(a));
//		System.out.println(min(a));
//		System.out.println(levels(a));
//		levelOrder(a);
		
		levelOrderLineWise(a);
	}
	
	public static void levelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(q.size() > 0)
		{
			Node front = q.remove();
			System.out.print(front.val + " ");
			if(front.left != null) q.add(front.left);
			if(front.right != null) q.add(front.right);
		}
		
	}
	
	public static void levelOrderLineWise(Node root)
	{
		Queue<Pair> q = new LinkedList<>();
		int currLevel = 0;
		q.add(new Pair(root , 0));
		
		while(q.size() > 0)
		{
			Pair front = q.remove();
			if(front.level != currLevel)
			{
				currLevel++;
				System.out.println();
			}
			
			System.out.print(front.node.val + " ");
			if(front.node.left != null) q.add(new Pair(front.node.left , front.level + 1));
			if(front.node.right != null) q.add(new Pair(front.node.right , front.level + 1));
		}
	}
	
	public static int levels(Node root)
	{
		if(root == null) return 0;
		return 1 + Math.max(levels(root.left) , levels(root.right));
	}
	
	public static int size(Node root)
	{
		if(root == null) return 0;
		
		return 1 + size(root.left) + size(root.right);
	}
	
	public static int sum(Node root)
	{
		if(root == null) return 0;
		
		return root.val + sum(root.left) + sum(root.right);
	}
	
	public static int product(Node root)
	{
		if(root == null) return 1;
		
		return root.val * product(root.left) * product(root.right);
	}
	
	public static int productNonZero(Node root)
	{
		if(root == null || root.val == 0) return 1;
		
		return root.val * productNonZero(root.left) * productNonZero(root.right);
	}
	
	public static int max(Node root)
	{
		if(root == null) return Integer.MIN_VALUE;
		
		return Math.max(root.val , Math.max(max(root.left), max(root.right)));
	}
	
	public static int min(Node root)
	{
		if(root == null) return Integer.MAX_VALUE;
		
		return Math.min(root.val , Math.min(min(root.left), min(root.right)));
	}
	
	public static void preOrder(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void inOrder(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " ");
		inOrder(root.left);
		inOrder(root.right);
	}
	public static void postOrder(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " ");
		postOrder(root.left);
		postOrder(root.right);
	}
}
