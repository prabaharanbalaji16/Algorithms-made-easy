import java.util.Hashtable;

public class Problem8 {

    void isLooped(Node head)
    {
        Hashtable<Integer,Node> hashtable = new Hashtable<>();

        while(head!=null)
        {
            if(hashtable.contains(head))
            {
                System.out.println("Loop found");
                return;
            }
            else
            {
                hashtable.put(head.item, head);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        Problem8 linkedList = new Problem8();
        
        Node head =  new Node(10);

        Node l1 = new Node(17);
        head.next = l1;

        Node l2 = new Node(33);
        l1.next = l2;

        Node l3 = new Node(41);
        l2.next = l3;
        Node l4 = new Node(92);
        l3.next = l4;
        // l4.next = l2;

        linkedList.isLooped(head);
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
