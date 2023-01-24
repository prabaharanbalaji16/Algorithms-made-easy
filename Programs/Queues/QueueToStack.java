package Queues;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueToStack {
    public static void main(String[] args) {
        QueueToStack qs = new QueueToStack();
        
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        qs.find(queue);
    }

    void find(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
        }

        System.out.println("First element: "+stack.peek());
    }
}
