public class Problem18 {
    public static void main(String[] args) {

        Node first1 = new Node(1);
        Node first2 = new Node(3);
        first1.next = first2;
        Node first3 = new Node(5);
        first2.next = first3;

        Node two1 = new Node(2);
        Node two2 = new Node(4);
        two1.next = two2;

        Node intersection = new Node(100);

        first3.next = intersection;
        two2.next = intersection;


        Problem18 Intersection = new Problem18();

        Intersection.findIntersection(first1, two1);

    }

    void findIntersection(Node firstHead, Node secondHead)
    {
        while(firstHead!=null & firstHead.next!=null)
        {
            Node second = secondHead;
            while(second!=null & second.next!=null)
            {
                if(firstHead.next==second.next)
                {
                    System.out.println("Intersection found"+firstHead.next.item+""+second.next.item);
                    return;
                }

                second = second.next;
            }

            firstHead = firstHead.next;
        }
    }
}

class Node{
    int item;
    Node next;
    Node(){}

    Node( int item)
    {
        this.item = item;
        this.next = null;
    }
}