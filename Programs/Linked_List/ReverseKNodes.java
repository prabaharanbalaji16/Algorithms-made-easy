public class ReverseKNodes
{
    public static void main(String args[])
    {
        ReverseNode one = new ReverseNode(1);
        ReverseNode two = new ReverseNode(2);
        ReverseNode three = new ReverseNode(3);
        ReverseNode four = new ReverseNode(4);
        ReverseNode five = new ReverseNode(5);
        ReverseNode six = new ReverseNode(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        ReverseKNodes reverseKNodes = new ReverseKNodes();
        reverseKNodes.reverse(one,2);
    }

    ReverseNode reverse(ReverseNode head,int k)
    {
        ReverseNode current = head;
        ReverseNode prevCurrent = head;
        ReverseNode prevTail = new ReverseNode();

        while(current!=null)
        {
            System.out.println("Outer While Loop starts");
            int count = k;
            ReverseNode tail = new ReverseNode(0);
            while(current!=null && count >0)
            {
                System.out.println("Inner While Loop starts");
                System.out.println("Value of k: "+count);
                System.out.println("Before reverse");
                System.out.println("Value of current: "+current.item);
                System.out.println("Value of current.next: "+current.next.item);
                System.out.println("Value of Tail: "+tail.item);
                
                ReverseNode temp = current.next;
                current.next = tail;
                tail = current;
                current = temp;

                System.out.println("After reverse");
                System.out.println("Value of current: "+current.item);
                System.out.println("Value of current.next: "+current.next.item);
                System.out.println("Value of Tail: "+tail.item);
                count--;

                System.out.println("Inner While Loop ends");
            }

            System.out.println("Value of tail after inner loop: "+tail.item);
            if(prevTail.item!=0)
            {
                System.out.println("Inside if");
                System.out.println("Before value of prevTail: "+prevTail.item);
                prevTail.next=tail;
                System.out.println("After value of prevTail: "+prevTail.item);
                System.out.println("if ends");
            }
            else
            {
                System.out.println("Inside else");
                System.out.println("Before value of head: "+head.item);
                head = tail;
                System.out.println("After value of head: "+head.item);
                System.out.println("else ends");
            }
            System.out.println("Before value of prevTail: "+prevTail.item);
            System.out.println("Before value of prevCurrent: "+prevCurrent.item);
            prevTail = prevCurrent;
            prevCurrent = current;
            System.out.println("Before value of prevTail: "+prevTail.item);
            System.out.println("Before value of prevCurrent: "+prevCurrent.item);
            System.out.println("Outer While Loop ends");
        }

        // while(head!=null)
        // {
        //     System.out.println(head.item);
        //     head = head.next;
        // }
        return null;
    }
}

class ReverseNode{
    int item;
    ReverseNode next;

    ReverseNode(){}

    ReverseNode(int item)
    {
        this.item = item;
        next = null;
    }
}