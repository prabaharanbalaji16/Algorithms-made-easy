package Stacks;

import java.util.Stack;

public class GetMin {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public static void main(String[] args) {
        GetMin getMin = new GetMin();
        getMin.insert(2);
        getMin.insert(6);
        getMin.insert(4);

        getMin.insert(1);
        getMin.insert(5);

        getMin.minimum();

        getMin.pop();
        getMin.pop();
        getMin.minimum();
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
            if(min.peek()>val)
            {
                min.push(val);
            }
            else
            {
                min.push(min.peek());
            }
        }
    }

    void pop()
    {
        stack.pop();
        min.pop();
    }
    void minimum()
    {
        System.out.println(min.pop());
    }
}
