package LinkedList.Doubly;

public class RotateDoublyLinkedList
{
	public static void main(String[] args) 
	{
		
	}
	
	public ListNode rotateDLL(ListNode head, int k) 
    {
        ListNode temp = head;
        int n = 0;
        
        while(temp != null)
        {
            temp = temp.next;
            n++;
        }
        
        k = k % n;
        if(k == 0) return head;

        temp = head;
        for(int i = 0; i < k-1; i++)
        {
            temp = temp.next;
        }
        
        ListNode h = temp.next;
        
        
        temp.next = null;
        h.prev = null;
        
        ListNode tail = h;
        
        while(tail.next != null)
        {
            tail = tail.next;
        }
        
        tail.next = head;
        head.prev = tail;
        
        
        return h;
    }
}
