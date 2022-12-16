import java.util.*;

public class Problem20 {
    public static void main(String[] args) {

        Hashtable<Integer,Node> hashtable = new Hashtable<>();
        
        Node first1 = new Node(1);
        Node first2 = new Node(5);
        first1.next = first2;
        Node first3 = new Node(3);
        first2.next = first3;

        Node two1 = new Node(4);
        Node two2 = new Node(2);
        two1.next = two2;

        hashtable.put(1,two1);
        hashtable.put(2,two2);

        Node intersection = new Node(100);

        first3.next = intersection;
        two2.next = intersection;
        hashtable.put(3,intersection);

        Problem20 Intersection = new Problem20();

        Intersection.findIntersection(first1, two1,hashtable);
    }

    void findIntersection(Node first, Node second,Hashtable<Integer,Node> hashtable)
    {
        while(first!=null)
        {
            if(hashtable.values().contains(first))
            {
                System.out.println("Intersection found");
            }
            first = first.next;
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