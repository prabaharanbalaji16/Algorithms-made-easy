package Stacks;

import java.util.Stack;

public class LinkedList {
    public static void main(String[] args) {
        StackNode oneFirst = new StackNode();
        oneFirst.item = 1;
        StackNode oneSecond = new StackNode(2);

        StackNode twoFirst = new StackNode(3);
        StackNode twoSecond = new StackNode(4);
        StackNode twoThrid = new StackNode(5);

        StackNode commonFirst = new StackNode(6);
        StackNode commonSecond = new StackNode(7);

        commonFirst.next = commonSecond;
        commonSecond.next=null;

        oneFirst.next = oneSecond;
        oneSecond.next = commonFirst;

        twoFirst.next = twoSecond;
        twoSecond.next = twoThrid;
        twoThrid.next = commonFirst;

        LinkedList linkedList = new LinkedList();
        linkedList.find(oneFirst, twoFirst);
    }

    void find(StackNode first, StackNode second)
    {
        Stack<StackNode> stack1 = new Stack<StackNode>();
        Stack<StackNode> stack2 = new Stack<StackNode>();
        StackNode intersect = null;
        while(first!=null)
        {
            stack1.push(first);
            first = first.next;
        }

        while(second!=null)
        {
            stack2.push(second);
            second = second.next;
        }

        while(stack1.peek()==stack2.peek())
        {
            intersect =(StackNode) stack1.pop();
            stack2.pop();
        }
        System.out.println(intersect.item);
    }

}
class StackNode{
    int item;
    StackNode next;

    StackNode(){};

    StackNode(int item)
    {
        this.item = item;
    }
}
