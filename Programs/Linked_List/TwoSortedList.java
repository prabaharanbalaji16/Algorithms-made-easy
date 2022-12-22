public class TwoSortedList
{
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

        TwoSortedList twoSortedList = new TwoSortedList();
        Node merged =  twoSortedList.mergeSort(first1,second1);

        while(merged!=null)
        {
            System.out.println(merged.item);
            merged = merged.next;
        }
    }

    Node mergeSort(Node first, Node second)
    {
        if(first == null)
        {
            return second;
        }
        if(second == null)
        {
            return first;
        }
        Node third = new Node();
        if(first.item <= second.item)
        {
            third = first;
            third.next = mergeSort(first.next, second);
        }
        else
        {
            third = second;
            third.next = mergeSort(first,second.next);
        }
        return third;
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