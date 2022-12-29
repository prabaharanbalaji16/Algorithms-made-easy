public class Modular1{
    public static void main(String[] args) {
        Node first1 = new Node(1);
        Node first2 = new Node(5);
        first1.next = first2;
        Node first3 = new Node(3);
        first2.next = first3;
        Node first4 = new Node(7);
        first3.next = first4;
        Node first5 = new Node(15);
        first4.next = first5;
        Node first6 = new Node(33);
        first5.next = first6;
        Node first7 = new Node(13);
        first6.next = first7;
        Node first8 = new Node(37);
        first7.next = first8;

        Modular1 modular =new Modular1();
        modular.find(first1,8,3);
    }
    void find(Node head, int n, int k)
    {
        Node modularNode = null;
        if(k<=0)
        {
            return;
        }
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(head!=null)
            {
                count++;
                if(count%k==0)
                {
                    modularNode = head;
                }
                head = head.next;   
            }
        }

        System.out.println(modularNode.item);
    }
}