import java.util.Hashtable;

public class MiddleNode1{
    public static void main(String[] args) {

        Hashtable<Integer,Node> hashtable = new Hashtable<Integer,Node>();

        Node first1 = new Node(1);
        Node first2 = new Node(5);
        first1.next = first2;
        Node first3 = new Node(3);
        first2.next = first3;
        Node first4 = new Node(7);
        first3.next = first4;
        Node first5 = new Node(15);
        first4.next = first5;
        Node first6 = new Node(33);
        first5.next = first6;
        Node first7 = new Node(13);
        first6.next = first7;
        Node first8 = new Node(37);
        first7.next = first8;

        hashtable.put(1, first1);
        hashtable.put(2, first2);
        hashtable.put(3, first3);
        hashtable.put(4, first4);
        hashtable.put(5, first5);
        hashtable.put(6, first6);
        hashtable.put(7, first7);
        hashtable.put(8, first8);

        MiddleNode1 middleNode = new MiddleNode1();
        middleNode.findMiddle(first1 , hashtable);
    }

    void findMiddle(Node head, Hashtable<Integer,Node> hashtable)
    {
        int mid = hashtable.size()/2;
        Node midNode =(Node) hashtable.get(mid);
        System.out.println(midNode.item);
    }
}

class Node{
    int item;
    Node next;
    Node(){}

    Node( int item)
    {
        this.item = item;
        this.next = null;
    }
}