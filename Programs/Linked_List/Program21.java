import java.util.Stack;

public class Program21 {
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
        
        Program21 Intersection = new Program21();
        Intersection.findIntersection(first1, two1);
    }

    void findIntersection(Node first, Node second)
    {
        Stack firstStack = new Stack();

        Stack secondStack = new Stack();

        while(first!=null)
        {
            firstStack.push(first);
            first = first.next;
        }

        while(second!=null)
        {
            secondStack.push(second);
            second = second.next;
        }
        Node temp=null;
        while(firstStack.pop()==secondStack.pop())
        {
            temp = (Node) firstStack.pop();
        }
        System.out.println("Intersection found "+temp.item);
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

    public void findIntersection(Node first1, Node two1) {
    }
}