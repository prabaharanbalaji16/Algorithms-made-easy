package Queues;

import java.util.Stack;

public class TwoStacks{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        TwoStacks queue = new TwoStacks();
        queue.enQueue(10);
        queue.enQueue(4);
        queue.enQueue(7);
        queue.enQueue(7);
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(9);

        queue.deQueue();
        
    }

    void enQueue(int data)
    {
        stack1.push(data);
    }
    void deQueue()
    {
        int data =0;
        if(!stack2.isEmpty())
        {
           data = stack2.pop();
        }
        else
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
            data = stack2.pop();
        }

        System.out.println(data);
    }
}