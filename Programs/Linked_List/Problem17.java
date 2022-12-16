public class Problem17 {
    public static void main(String[] args) {
        Node head =  new Node(10);
        Node l1 = new Node(15);
        head.next = l1;
        Node l2 = new Node(20);
        l1.next = l2;
        Node l3 = new Node(30);
        l2.next = l3;
        Node l4 = new Node(35);
        l3.next = l4;

        Problem17 linkedListReverse = new Problem17();

        linkedListReverse.print(linkedListReverse.iterative(head));
    }

    Node iterative(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev =current;
            current = next;
        }
        head = prev;
        return head;
    }

    void print(Node head)
    {
        while(head.next!=null)
        {
            System.out.println(head.item);
            head= head.next;
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