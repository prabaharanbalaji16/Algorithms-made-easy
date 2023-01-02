public class Median {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);
        Node head6 = new Node(6);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        Median median = new Median();
        median.find(head1);
    }
    void find(Node head)
    {
        Node fastNode = head;
        Node slowNode = head;
        Node prevSlowNode = slowNode;

        while(fastNode!=null && fastNode.next!=null)
        {
            fastNode = fastNode.next.next;
            prevSlowNode = slowNode;
            slowNode = slowNode.next;
        }
        if(fastNode!=null)
        {
            System.out.println("Median: "+slowNode.item);
        }
        else
        {
            System.out.println("Median :"+(float)(prevSlowNode.item + slowNode.item)/2);
        }
    }
}
