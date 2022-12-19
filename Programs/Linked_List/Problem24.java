public class Problem24 {
    public static void main(String[] args) {
        Node first1 = new Node(1);
        Node first2 = new Node(5);
        first1.next = first2;
        Node first3 = new Node(3);
        first2.next = first3;

        Node two1 = new Node(4);
        Node two2 = new Node(2);
        two1.next = two2;

        

        Node intersection = new Node(100);
        Node nullNode = new Node();
        intersection.next = nullNode;

        first3.next = intersection;
        two2.next = intersection;

        Problem24 Intersection = new Problem24();
        Intersection.findIntersection(first1,two1);
    }

    void findIntersection(Node first, Node second)
    {
        Node firstNode = first;
        Node secondNode = second;
        int firstSize = 0;
        int secondSize = 0;
        while(firstNode!=null)
        {
            firstNode = firstNode.next;
            firstSize++;
        }

        while(secondNode!=null)
        {
            secondNode = secondNode.next;
            secondSize++;
        }

        int diff = firstSize - secondSize;

        for(int i=0;i<diff;i++)
        {
            first = first.next;
        }

    while(first!=null && second!=null)
    {
        if(first==second)
        {
            System.out.println("Intersection Found");
            return;
        }
        first = first.next;
        second = second.next;
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

    public void findIntersection() {
    }
}