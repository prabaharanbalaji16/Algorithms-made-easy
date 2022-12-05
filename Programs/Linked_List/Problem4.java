public class Problem4 {
    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListImpl();

        linkedListImpl.push(2);
        linkedListImpl.push(7);
        linkedListImpl.push(1);
        linkedListImpl.push(8);
        linkedListImpl.push(100);

        linkedListImpl.findItem(5);
    }
}

class LinkedListImpl{
    private class Node{
        int item;
        Node next;
    }

    int N = 0;
    Node head;

    void push(int item)
    {
        Node oldhead = head;
        head = new Node();
        head.item = item;
        head.next = oldhead;
        N++;
    }

    void findItem(int n)
    {
        for(int i=1;i<=N;i++)
        {
            if(i==n)
            {
                System.out.println(head.item);
                break;
            }
            head = head.next;
        }
    }
}