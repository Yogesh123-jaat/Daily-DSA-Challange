package LinkedList.Doubly;

public class ReverseDoublyLinkedList 
{
	public static void main(String[] args) 
	{

	}
	
	public static ListNode reverseDLL(ListNode head)
	{
		
		ListNode curr = head;
		ListNode pre = null;
		ListNode fwd = null;
		
		while(curr != null)
		{
			fwd = curr.next;
			curr.next = pre;
			curr.prev = fwd;
			pre = curr;
			curr = fwd;
		}
		return pre;
	}
	
	public static ListNode reverse(ListNode head)
	{
		ListNode curr = head;
		ListNode temp = null;
		
		while(curr != null)
		{
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
	}
}
