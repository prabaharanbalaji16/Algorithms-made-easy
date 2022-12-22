public class TwoSortedList2 {
    public static void main(String[] args) {
        Node first1 = new Node(1);
        Node first2 = new Node(2);
        Node first3 = new Node(3);

        first1.next = first2;
        first2.next = first3;

        Node second1 = new Node(2);
        Node second2 = new Node(4);
        Node second3 = new Node(5);

        second1.next = second2;
        second2.next = second3;

        TwoSortedList2 twoSortedList = new TwoSortedList2();
        Node merged =  twoSortedList.mergeSort(first1,second1);

        while(merged!=null)
        {
            System.out.println(merged.item);
            merged = merged.next;
        }
    }
    Node mergeSort(Node first, Node second)
    {
        Node third = new Node(0);
        Node current = third;

        while(first!=null & second!=null)
        {
           
            if(first.item <= second.item)
            {
                current.next = first;
                first = first.next;
            }
            else
            {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        if(first==null)
        {
            current.next = second;
        }
        if(second==null)
        {
            current.next = first;
        }
       
        return third.next;
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