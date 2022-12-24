public class SplitCircularList {
    public static void main(String[] args) {
        Node head1 = new Node(20);
        Node head2 = new Node(12);
        Node head3 = new Node(2);
        Node head4 = new Node(7);
        Node head5 = new Node(10);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head1;
        
        SplitCircularList circularList = new SplitCircularList();
        circularList.split(head1);
    }

    void split(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next!=head)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next==head)
        {
            fast = fast.next;
        }
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = null;
        fast.next = null;

        while(head1!=null)
        {
            System.out.print(head1.item+" ");
            head1 = head1.next;
        }

        System.out.println();

        while(head2!=null)
        {
            System.out.print(head2.item +" ");
            head2 = head2.next;
        }
    }
}
