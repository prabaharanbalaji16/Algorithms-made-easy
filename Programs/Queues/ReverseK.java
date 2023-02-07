package Queues;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class ReverseK{
    public static void main(String[] args) {
        ReverseK reverse = new ReverseK();
        Queue<Integer> queue = new LinkedBlockingDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        reverse.reverse(queue,4);
    }

    void reverse(Queue<Integer> queue, int k)
    {
        System.out.println(queue);
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<k;i++)
        {
            stack.push(queue.poll());
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
        for(int i=0;i<queue.size()-k;i++)
        {
            queue.add(queue.remove());
        }
        System.out.println(queue);
    }
}