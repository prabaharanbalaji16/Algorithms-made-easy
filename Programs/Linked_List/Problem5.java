public class Problem5
{
    public static void main(String[] args) {
        LinkedListImplementation linkedListImpl = new LinkedListImplementation();

        linkedListImpl.push(21);
        linkedListImpl.push(73);
        linkedListImpl.push(10);
        linkedListImpl.push(18);
        linkedListImpl.push(36);

        linkedListImpl.findItem(3);
    }
}
class LinkedListImplementation{
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
        Node pTemp = head;
        Node pNthNode = null;

        for(int i=1;i<n;i++)
        {
            if(pTemp!=null)
            {
                pTemp = pTemp.next;
            }
        }
        while(pTemp!=null)
        {
            if(pNthNode==null)
            {
                pNthNode=head;
            }
            else
            {
                pNthNode = pNthNode.next;
            }

            pTemp = pTemp.next;
        }
        if(pNthNode!=null)
        {
           System.out.println(pNthNode.item);
        }
    }
}