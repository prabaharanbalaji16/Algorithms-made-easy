package Stacks;

import java.util.PriorityQueue;
import java.util.Queue;

public class OneStack {

    Queue<Integer> queue1 = new PriorityQueue<Integer>();
    Queue<Integer> queue2 = new PriorityQueue<Integer>();

    public static void main(String[] args) {
        OneStack stack = new OneStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    void push(int data)
    {
        queue1.add(data);
    }

    int pop()
    {
        if(queue1.isEmpty() && queue2.isEmpty())
        {
            System.out.println("Stack is Empty");
            System.exit(0);
        }
        while(queue1.size()!=1)
        {
            queue2.add(queue1.poll());
        }

        int data = queue1.poll();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 =temp;

        return data;
    }
}
