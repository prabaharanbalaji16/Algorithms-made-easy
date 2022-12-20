public class BeforeElement {
    public static void main(String[] args) {
        Nodes first1 = new Nodes(1);

        first1.before = null;
        
        Nodes first2 = new Nodes(5);
        
        first1.next = first2;
        first2.before = first1;
        
        Nodes first3 = new Nodes(3);
        
        first3.before = first2;
        first2.next = first3;
        
        Nodes first4 = new Nodes(7);
        
        first4.before = first3;
        first3.next = first4;
        
        Nodes first5 = new Nodes(15);
        
        first5.before = first4;
        first4.next = first5;
        
        Nodes first6 = new Nodes(33);
        first6.before = first5;
        first5.next = first6;

        Nodes first7 = new Nodes(13);
        first7.before = first6;
        first6.next = first7;
        
        Nodes first8 = new Nodes(37);
        first8.before = first7;
        first7.next = first8;

        BeforeElement linkedList = new BeforeElement();
        linkedList.endOfList(first6);
    }

    void endOfList(Nodes head)
    {
        while(head.before!=null)
        {
            head = head.before;
            System.out.println(head.item);
            // Nodes temp = head.before;
            // head = temp;
        }
    }
}
class Nodes{
    int item;
    Nodes next;
    Nodes before;
    Nodes(){}

    Nodes( int item)
    {
        this.item = item;
        this.next = null;
    }
}