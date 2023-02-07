public class Insertion {
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

        Insertion insertion = new Insertion();
        Node sorted = insertion.sort(head1);

        while(sorted!=null)
        {
            System.out.println(sorted.item);
            sorted=sorted.next;
        }
    }

    Node sort(Node head)
    {
        Node temp = head;
        
        while(temp!=null)
        {
            Node start = head;
            Node prev = head;
            Node next = temp.next;
            while(start!=next)
            {
                System.out.println("head: "+head.item);
                System.out.println("start: "+start.item);
                System.out.println("prev: "+prev.item);
                if(next!=null)
                {
                    System.out.println("next: "+next.item);
                }
                System.out.println("temp: "+temp.item);
                System.out.println(start.item+" "+temp.item);

                if(start.item > temp.item)
                {
                    System.out.println("In");
                    temp.next = start;
                
                    if(start == head)
                    {
                        head = temp;
                    }
                    else
                    {
                        prev.next = temp;
                    }

                    while(start.next!=temp)
                    {
                        start = start.next;
                    }
                    start.next = next;
                }
                prev = start;
                start = start.next;
            }
            System.out.println("TEmp");
            temp = next;
        }
        return head;
    }
}
