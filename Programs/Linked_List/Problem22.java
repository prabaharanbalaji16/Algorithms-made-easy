public class Problem22 {
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

        Problem22 Intersection = new Problem22();
        Intersection.findIntersection(first1,two1);

    }

    void findIntersection(Node first,Node second)
    {
        int N=0;
        Node[] nodeList = new Node[9];

        while(first!=null)
        {
            nodeList[N] = first;
            first = first.next;
            N++;
        }
        while(second!=null)
        {
            nodeList[N] = second;
            second = second.next;
            N++;
        }
        
        for(int i=0;i<nodeList.length;i++)
        {
            for(int j=i+1;j<nodeList.length;j++)
            {
                if(nodeList[i]==nodeList[j])
                {
                    System.out.println("Intersection Found");
                    return;
                }
            }
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