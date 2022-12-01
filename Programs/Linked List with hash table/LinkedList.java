import java.util.Hashtable;

// package Linked List with hash table;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListImpl();
        linkedListImpl.push(2);
        linkedListImpl.push(7);
        linkedListImpl.push(1);
        linkedListImpl.push(8);
        linkedListImpl.push(100);

        linkedListImpl.findElement(3);
    }

}

class LinkedListImpl{

    Node head;
    Integer N=0;

    Hashtable<Integer,Node> hashtable = new Hashtable<Integer,Node>();

    private class Node{
        int item;
        Node next;
    }

    void push(int i)
    {
        Node oldHead = head;
        head = new Node();
        head.item = i;
        head.next = oldHead;
        N++;
        hashtable.put(N, head);
    }

    void findElement(int n)
    {
        System.out.println(hashtable.get(n).item);
    }
}

// Time = O(n)
// Space = O(n)
