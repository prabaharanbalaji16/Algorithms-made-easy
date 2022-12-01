// package nth Node from the end of the Linked List;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListImpl();
        
        linkedListImpl.push(2);
        linkedListImpl.push(7);
        linkedListImpl.push(1);
        linkedListImpl.push(4);

        linkedListImpl.FindElement(2);
        
    }
 
}

class LinkedListImpl{
    Node head = null;

    private class Node{
        int item;
        Node next;
    }

    public void push(int i) {
        Node oldhead = head;
        head = new Node();
        head.item = i;
        head.next = oldhead;
    }  

    public int FindElement(int n)
    {
        for(int i=0;i<=n;i++)
        {
            head = head.next;
            if(i==n-1)
            {
                System.out.println(head.item);
                break;
            }    
        }
        return 0;
    }
}


// Time = O(n^2)
// Space = O(1)
// To increase the complexity please refer the Linked List with hash table