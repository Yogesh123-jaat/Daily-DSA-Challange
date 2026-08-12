package LinkedList;

import java.util.ArrayList;

public class SplitaLinkedListintotwohalves {

	public static void main(String[] args)
	{
		
	}
	public ArrayList<Node> splitList(Node head)
    {
		ArrayList<Node> Pair = new ArrayList<>();
		
        Node temp = head;
        
        while(temp.next != head)
        {
            temp = temp.next;
        }
        
        temp.next = null;
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node b = slow.next;
        slow.next = head;
        temp.next = b;
        
        Pair.add(head);
        Pair.add(b);
        
        return Pair;
    }
}
