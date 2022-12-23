public class ReversePair2 {
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

        ReversePair2 reversePair = new ReversePair2();

        Node reversed = reversePair.reverse(first1);

        while(reversed!=null)
        {
            System.out.println(reversed.item);
            reversed = reversed.next;
        }
    }

    Node reverse(Node head) {
        Node temp = null;
        if(head==null)
        {
            return null;
        }
        else
        {
            temp = head.next;
            head.next = temp.next;
            temp.next = head;
            head = temp;

            head.next.next = reverse(head.next.next);
            return head;
        }
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
