public class Problem11{
    public static void main(String[] args) {
        Problem11 linkedList = new Problem11();
        SnakeSnail head =  new SnakeSnail(10);
        SnakeSnail l1 = new SnakeSnail(17);
        head.next = l1;
        SnakeSnail l2 = new SnakeSnail(33);
        l1.next = l2;
        SnakeSnail l3 = new SnakeSnail(41);
        l2.next = l3;
        SnakeSnail l4 = new SnakeSnail(92);
        l3.next = l4;
        l4.next = l1;
        linkedList.func(head);
    }

    void func(SnakeSnail head)
    {
        int n=SnakeSnail.N;
        
        for(int i=0;i<n;i++)
        {
            SnakeSnail pointer = head.next;     
            for(int j=1;j<n;j++)
            {
                if(head == pointer){
                    
                    System.out.println("Snail");
                    return;
                }
                if(pointer.next==null)
                {
                    System.out.println("Snake");
                }
                pointer = pointer.next;
            }
            System.out.println();
            head = head.next;
        }
    }
}

class SnakeSnail{
    static int N=0;
    int item;
    SnakeSnail next;
    SnakeSnail(){}

    SnakeSnail( int item)
    {
        this.item = item;
        this.next = null;
        N++;
    }
}