import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Problem19 {
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

        first3.next = intersection;
        two2.next = intersection;

        Problem19 Intersection = new Problem19();

        Intersection.findIntersection(first1, two1);
    }

    void findIntersection(Node firstHead,Node secondHead)
    {
        Node[] firstArr =new Node[4];
        Node[] secondArr =new Node[3];
        int n=0;
        while(firstHead!=null)
        {
            firstArr[n] = firstHead;
            firstHead = firstHead.next;
            n++;
        }

        n=0;
        while(secondHead!=null)
        {
            secondArr[n] = secondHead;
            secondHead = secondHead.next;
            n++;
        }

               
        for(int i=0;i<firstArr.length;i++)
        {
            for(int j=i+1;j<firstArr.length;j++)
            {
                if(firstArr[i].item > firstArr[j].item)
                {
                    int temp = firstArr[i].item;
                    firstArr[i].item = firstArr[j].item;
                    firstArr[j].item = temp;
                }

            }
        }

        for(int i=0;i<secondArr.length;i++)
        {
            for(int j=i+1;j<secondArr.length;j++)
            {
                if(secondArr[i].item > secondArr[j].item)
                {
                    int temp = secondArr[i].item;
                    secondArr[i].item = secondArr[j].item;
                    secondArr[j].item = temp;
                }

            }
        }


        for(int i=0;i<firstArr.length;i++)
        {
            for(int j=0;j<secondArr.length;j++)
            {
                if(firstArr[i].item == secondArr[j].item)
                {
                    System.out.println("Intersection detected");
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
}