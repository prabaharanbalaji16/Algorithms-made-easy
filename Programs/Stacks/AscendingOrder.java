package Stacks;

import java.util.Stack;

public class AscendingOrder {
    public static void main(String[] args) {
        AscendingOrder ascendingOrder = new AscendingOrder();
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(8);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        stack1.push(1);
        stack1.push(5);

        ascendingOrder.sort(stack1);
    }

    void sort(Stack<Integer> unsorted)
    {
        Stack<Integer> sorted = new Stack<Integer>();

        while(!unsorted.isEmpty())
        {
            int temp = unsorted.pop();
            while(!sorted.isEmpty() && sorted.peek() > temp)
            {
                unsorted.push(sorted.pop());
            }
            sorted.push(temp);
        }

        System.out.println(sorted);
    }
}
