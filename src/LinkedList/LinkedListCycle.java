package LinkedList;

public class LinkedListCycle 
{
	public static void main(String[] args) 
	{
		
	}
	
	public boolean hasCycle(Node head)  // proof of cycle of a linked list
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }    

        return false;
    }
}
