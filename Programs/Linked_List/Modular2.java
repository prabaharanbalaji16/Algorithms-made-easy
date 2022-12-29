public class Modular2 {
    public static void main(String[] args) {
        Node first1 = new Node(1);
        Node first2 = new Node(2);
        first1.next = first2;
        Node first3 = new Node(3);
        first2.next = first3;
        Node first4 = new Node(4);
        first3.next = first4;
        Node first5 = new Node(5);
        first4.next = first5;
        Node first6 = new Node(6);
        first5.next = first6;
        Node first7 = new Node(7);
        first6.next = first7;
        Node first8 = new Node(8);
        first7.next = first8;
        Node first9 = new Node(9);
        first8.next = first9;
        Node first10 = new Node(10);
        first9.next = first10;
        

        Modular2 modular = new Modular2();
        modular.find(first1,9,3);
    }

    void find(Node head, int n, int k)
    {
        Node modulaNode = null;
        if(k<=0)
        {
            return;
        }

        int count = 0;
        while(head!=null)
        {
            count++;
            if(count%k==0)
            {
                modulaNode = head;
            }
                head = head.next;
                
        }

        System.out.println(modulaNode.item);
    }
}
