package LinkedList;

public class RemoveNodesFromLL2487 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node removeNodes(Node head)
	{
		head = reverse(head);

        int max = head.val;
        Node curr = head;

        while(curr != null && curr.next != null)
        {
            if(curr.next.val < max)
            {
                curr.next = curr.next.next;
            }
            else
            {
                curr = curr.next;
                max = curr.val;
            }
        }

        return reverse(head);
		
	}
	
	public static Node reverse(Node head)
	{
		Node curr = head;
        Node prev = null;
        Node fwd = null;
        
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        
        return prev;
	}
}
