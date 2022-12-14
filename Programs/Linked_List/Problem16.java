public class Problem16 {
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

        Node newNode = new Node(25);

        Problem16 linkedList = new Problem16();
        

        linkedList.print(linkedList.func(head, newNode));
    }

    Node func(Node head,Node newNode)
    {
        Node current = head;
        Node temp=null;
        while(current !=null && current.item < newNode.item)
        {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;

        return head;
     }

    void print(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.item);
            head = head.next;
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