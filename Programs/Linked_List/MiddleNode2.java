public class MiddleNode2 {
    public static void main(String[] args) {

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
        Node first9 = new Node(77);
        first8.next = first9;

        MiddleNode2 middleNode = new MiddleNode2();

        middleNode.findMiddle(first1);
    }

    void findMiddle(Node head)
    {
        Node firstPtr = head;
        Node secondPrt = head;
        Node mid = null;
        while(secondPrt !=null && secondPrt.next!=null)
        {   
            firstPtr= firstPtr.next;
            secondPrt = secondPrt.next.next;

            mid = firstPtr;
        }
        System.out.println(mid.item);
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