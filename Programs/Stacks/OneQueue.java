package Stacks;

import java.util.Stack;

public class OneQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public static void main(String[] args) {
        OneQueue queue = new OneQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        
    }

    void enQueue(int data)
    {
        stack1.push(data);
    }

    int deQueue()
    {
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }

        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
    }
}
