public class Problem6 {
    public static void main(String[] args) {
        LinkedListRecursive linkedListImpl = new LinkedListRecursive();

        linkedListImpl.push(24);
        linkedListImpl.push(79);
        linkedListImpl.push(1);
        linkedListImpl.push(15);
        linkedListImpl.push(32);

        linkedListImpl.findItem(2);
    }
}
class LinkedListRecursive{
    private class Node{
        int item;
        Node next;
    }

    int N = 0;
    Node head;
    int count=0;

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
        findItem(head,n);
    }

    void findItem(Node head, int n)
    {
        if(head!=null)
        {
            findItem(head.next,n);
            count++;
            if(count==n)
            {
                System.out.println(head.item);
                return;
            }
        }
    }
}
