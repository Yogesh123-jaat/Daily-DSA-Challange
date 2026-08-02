package LinkedList;

public class RotateList61L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static int length(Node head)
	{
		Node temp = head;
		int len = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			len++;
		}
		
		return len;
	}
	
	public static Node rotateRight(Node head , int k)
	{
		if(head == null || head.next == null) return head;
		
		int n = length(head);
		
		k = k % n;
		
		if(k == 0) return head;
		
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i < k+1; i++)
		{
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		Node a = slow.next;
		slow.next = null;
		Node t = a;
		
		while(t.next != null)
		{
			t = t.next;
		}
		
		t.next = head;
		return a;
	}
}
