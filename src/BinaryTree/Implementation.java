package BinaryTree;

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
		
		display(a);
		System.out.println();
		System.out.println(size(a));
		System.out.println(sum(a));
		System.out.println(product(a));
		System.out.println(productNonZero(a));
		System.out.println(max(a));
		System.out.println(min(a));
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
	
	public static void display(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.val + " ");
		display(root.left);
		display(root.right);
	}
}
