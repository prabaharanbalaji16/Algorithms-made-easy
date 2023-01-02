import java.util.Stack;

public class ReOrder {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        ReOrder reOrder = new ReOrder();
        reOrder.order(head1);
    }

    void order(Node head)
    {
        Node head1 = head; 
        Node slowNode = head1;
        Node fastNode = head1;

        while(fastNode!=null && fastNode.next!=null)
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        Node mid = slowNode;
        Node head2 = slowNode.next;
        mid.next = null;

        Stack<Node> stack = new Stack<Node>();
        while(head2!=null)
        {
            Node temp = head2;
            head2 = head2.next;
            temp.next = null;
            stack.push(temp);
        }

        while(!stack.isEmpty())
        {
            Node temp = (Node)stack.pop();
            temp.next = head1.next;
            head1.next = temp;
            head1 = temp.next;
        }

        while(head!=null)
        {
            System.out.println(head.item);
            head = head.next;
        }


    }
}
