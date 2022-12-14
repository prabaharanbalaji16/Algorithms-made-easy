public class JosephusCircle{
    public static void main(String args[])
    {
        JosephusCircle circle =new JosephusCircle();

        circle.eliminate(5,1);
    }

    void eliminate(int N, int m)
    {
        Node head = new Node(1);
        Node headNext =head;
        for(int i=2;i<=N;++i)
        {
            head.next = new Node();
            head = head.next;
            head.item = i;
        }
        head.next = headNext;
    
        for(int i = N;i>1;i--)
        {
            for(int j=0;j<m;j++)
            {
                head = head.next;
                head.next = head.next.next;
            }
        }
        System.out.println(head.item);
    }
}
