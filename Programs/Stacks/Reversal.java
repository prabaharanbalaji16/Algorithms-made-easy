package Stacks;

import java.util.Stack;

public class Reversal {
    static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
       
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(3);
        stack.push(5);

        Reversal reversal = new Reversal();
        System.out.println(stack);
        reversal.reverse();
        System.out.println(stack);
    }

    Stack<Integer> reverse()
    {
        if(stack.isEmpty()) return null;

        int temp =(int) stack.pop();
        reverse();
        insertAtBack(temp);

        // System.out.println(stack.peek());
        return stack;
    }
    void insertAtBack(int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBack(data);
        stack.push(temp);
    }
}
