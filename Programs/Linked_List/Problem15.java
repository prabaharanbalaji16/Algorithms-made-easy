public class Problem15 {
    public static void main(String[] args) {
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
        Problem15 linkedList = new Problem15();
        linkedList.func(head);
    }

    void func(Node head)
    {
        Node slowPtr = head;
        Node fastPtr = head;
        boolean looped=false;
        while(fastPtr!=null && fastPtr.next !=null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr==fastPtr)
            {
                looped = true;
                break;
            }
        }

        int n = 0;
        if(looped)
        {
            slowPtr = head;
            do{
                slowPtr = slowPtr.next;
                n++;
            }
            while(slowPtr!=fastPtr);
        }
        System.out.println("Length: "+n);


        // Problem 12
    
        if(looped)
        {
            slowPtr = head;
            while(slowPtr!=fastPtr)
            {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            System.out.println(slowPtr.item);
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
