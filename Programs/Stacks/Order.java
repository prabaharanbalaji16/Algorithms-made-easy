package Stacks;

import java.util.Stack;

public class Order {
    Stack<Integer> stack = new Stack<Integer>();
    StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        String str= "SSSXXSSXSXXX";
        int value = 1;
        Order order = new Order();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c=='S')
            {
                order.push(value);
                value++;
            }
            else if(c=='X')
            {
                order.pop();
            }
        }

        order.print();
    }
    void push(int data)
    {
        stack.push(data);
    }

    void pop()
    {
        result.append(stack.pop());
    }

    void print()
    {
        System.out.println(result);
    }
}