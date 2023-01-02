public class Fractional{
    public static void main(String args[])
    {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        Node head3 = new Node(3);
        Node head4 = new Node(4);
        Node head5 = new Node(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        Fractional fractional = new Fractional();
        fractional.find(head1,2);
    }
    void find(Node head, int k)
    {
        Node fractionalNode = null;
        if(k<=0)
        {
            return;
        }
        int count=0;
        while(head!=null)
        {
            if(count%k==0)
            {
                if(fractionalNode==null)
                {
                    fractionalNode = head;
               }
               else
                {
                    fractionalNode = fractionalNode.next;
                }
            }
            count++;
            head = head.next;
        }

        System.out.println(fractionalNode.item);
    }
}