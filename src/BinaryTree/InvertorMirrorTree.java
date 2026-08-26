package BinaryTree;

public class InvertorMirrorTree 
{
	public static void main(String[] args) 
	{
		
	}
	public static Node invertTreePre(Node root)    // preorder postorder kaam kar jaayega
    {
        if(root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTreePre(root.left);
        invertTreePre(root.right);

        return root;
    }
	public static Node invertTreeIn(Node root)    // preorder postorder kaam kar jaayega
    {
        if(root == null) return null;

        invertTreeIn(root.left);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTreeIn(root.left);

        return root;
    }
	public static Node invertTreePost(Node root)    // preorder postorder kaam kar jaayega
    {
        if(root == null) return null;

        invertTreePost(root.left);
        invertTreePost(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
