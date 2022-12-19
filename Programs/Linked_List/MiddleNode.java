public class MiddleNode {
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

        MiddleNode middleNode = new MiddleNode();
        middleNode.findMiddle(first1);
    }

    void findMiddle(Node head)
    {
        Node tempHead = head;
         int N=0;
        while(tempHead!=null)
        {
            tempHead = tempHead.next;
            N++;
        }
        for(int i=1;i<N/2;i++)
        {
            head = head.next;
        }

        System.out.println(head.item);
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