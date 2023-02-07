package Queues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class InterLeavingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingDeque<Integer>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);
        queue.add(19);
        queue.add(20);

        InterLeavingQueue interLeavingQueue = new InterLeavingQueue();
        interLeavingQueue.execute(queue);
    }

    void execute(Queue<Integer> queue)
    {
        Queue<Integer> queue1 = new LinkedBlockingDeque<Integer>();
        if(queue.size()%2!=0)
        {
            throw new IllegalArgumentException("Odd numbered queue length");
        }

        for(int i=0;i<=(queue.size()/2)+1;i++)
        {
            queue1.add(queue.poll());
        }
        System.out.println(queue1);

        while(!queue1.isEmpty())
        {
            queue.add(queue1.remove());
            queue.add(queue.remove());
        }
        System.out.println(queue);
    }
}
