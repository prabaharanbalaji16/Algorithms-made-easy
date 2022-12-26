public class Swapping {
    public static void main(String[] args) {
        Swapping swapping = new Swapping();

        SwappingNode one = new SwappingNode("M");
        SwappingNode two = new SwappingNode("A");
        SwappingNode three = new SwappingNode("D");
        SwappingNode four = new SwappingNode("A");
        SwappingNode five = new SwappingNode("M");
        SwappingNode six = new SwappingNode("S");

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        two.prev = one;
        three.prev = two;
        four.prev = three;
        five.prev = four;
        six.prev = five;

        SwappingNode result = swapping.swap(one);

        while(result!=null)
        {
            System.out.println(result.item);
            result = result.next;
        }
    }

    SwappingNode swap(SwappingNode head)
    {
        SwappingNode head1 = head;
        SwappingNode temp = new SwappingNode();

        if(head1==null)
        {
            return null;
        }
        else
        {
            temp = head1.next;
            head1.next = temp.next;
            temp.next = head1;
            head1= temp;
            head1.next.next = swap(head1.next.next);
        }
        return head1;
    }
}

class SwappingNode{
    String item;
    SwappingNode next;
    SwappingNode prev;

    SwappingNode(){}

    SwappingNode(String item)
    {
        this.item = item;
        // next = null;
        // prev = null;
    }
}