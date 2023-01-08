package Stacks;

import java.util.Stack;

public class GetMin2 {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public static void main(String[] args) {
        GetMin2 getMin2 = new GetMin2();
        getMin2.insert(2);
        getMin2.insert(6);
        getMin2.insert(4);

        getMin2.insert(1);
        getMin2.insert(5);
        getMin2.insert(1);

        // getMin2.minimum();
        // getMin2.printMin();
        getMin2.pop();
        getMin2.pop();
        // getMin2.minimum();

        getMin2.printMin();
        getMin2.printStack();
    }
    void insert(int val)
    {
        stack.push(val);
        if(min.isEmpty())
        {
            min.push(val);
        }
        else
        {
            if(min.peek()>=val)
            {
                min.push(val);
            }
        }
    }

    void pop()
    {
        if(stack.peek() == min.peek())
        {
            min.pop();
        }
        stack.pop();
    }
    void minimum()
    {
        System.out.println(min.pop());
    }

    void printMin()
    {
        
        while(!min.isEmpty())
        {
            System.out.println(min.pop());
        }
    }

    void printStack()
    {
        System.out.println();
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        
    }
}
