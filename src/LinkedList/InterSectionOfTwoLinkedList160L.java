package LinkedList;

public class InterSectionOfTwoLinkedList160L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node getIntersectionNode(Node headA, Node headB) 
    {
        Node tempA = headA;
        int lengthA = 0;
        while(tempA != null)
        {
            tempA = tempA.next;
            lengthA++;
        }    

        Node tempB = headB;
        int lengthB = 0;

        while(tempB != null)
        {
            tempB = tempB.next;
            lengthB++;
        }

        int n = lengthA - lengthB;

        if(n < 0)
        {
            n = -n;
        }

        tempA = headA;
        tempB = headB;

        if(lengthA > lengthB)
        {
            for(int i = 0; i < n; i++)
            {
                tempA = tempA.next;
            }

            while(tempA != tempB)
            {
                tempA = tempA.next;
                tempB = tempB.next;
            }

            return tempA;
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                tempB = tempB.next;
            }

            while(tempA != tempB)
            {
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempB;
        }
    }
}
