package LinkedList;

public class DeletioninCircularLinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	public static Node deleteNode(Node head, int key) 
    {
        if(head == null || head.next == null) return head;
        Node tail = head;
        
        while(tail.next != head)
        {
            tail = tail.next;
        }
        
        tail.next = null;
        Node temp = head;
        Node k = head.next;
        
        if(head.val == key)
        {
            head = head.next;
            tail.next = head;
            return head;
        }
        
        while(k != null)
        {
            if(k.val == key)
            {
                if(k == tail)
                {
                    temp.next = null;
                    tail = temp;
                }
                else
                {
                    temp.next = temp.next.next;
                }
                break;
            }
            
            temp = temp.next;
            k = k.next;
        }
        
        tail.next = head;
        
        return head;
    }
}
