public class Problem10 {

    public static void main(String[] args) {
        Problem10 linkedList = new Problem10();
        
        Node head =  new Node(10);

        Node l1 = new Node(17);
        head.next = l1;

        Node l2 = new Node(33);
        l1.next = l2;

        Node l3 = new Node(41);
        l2.next = l3;
        Node l4 = new Node(92);
        l3.next = l4;
        l4.next = l2;

        linkedList.looped(head);
    }

    void looped(Node head)
    {
        Node slowPtr = head;
        Node fastPtr = head;

        while(slowPtr!=null && fastPtr!=null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            System.out.println(slowPtr.item+" "+fastPtr.item);
            if(slowPtr==fastPtr)
            {
                System.out.println("loop found");
                slowPtr = head;

                // Problem-12
                while(slowPtr!=fastPtr)
                {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                System.out.println(slowPtr.item);
                return;
            }
        }
        // slowPtr = head;
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