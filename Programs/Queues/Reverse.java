package Queues;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Reverse
{
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        System.out.println(reverse.reverse(queue));
    }

    Queue<Integer> reverse(Queue<Integer> queue)
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
        return queue;
    }
}