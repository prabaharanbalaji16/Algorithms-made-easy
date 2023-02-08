package Queues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TwoQueue {
    Queue<Integer> queue1 = new LinkedBlockingDeque<Integer>();
    Queue<Integer> queue2 = new LinkedBlockingDeque<Integer>();

    public static void main(String[] args) {
        TwoQueue stack = new TwoQueue();
        stack.push(10);
        stack.push(6);
        stack.push(7);
        stack.push(3);
        stack.push(4);
        stack.push(2);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    void push(int data)
    {
        if(queue1.isEmpty())
        {
            queue2.add(data);
        }
        else if(queue2.isEmpty())
        {
            queue1.add(data);
        }
    }

    void pop()
    {
        int data=0,i = 0,size;
        if(!queue1.isEmpty())
        {
             size = queue1.size();
            
            while(i<size-1)
            {
                queue2.add(queue1.poll());
                i++;
            }
            data = queue1.poll();
        }
        else if(!queue2.isEmpty())
        {
             size = queue2.size();
            while(i<size-1)
            {
                queue1.add(queue2.poll());
                size--;
            }
            data = queue2.poll();
        }
        System.out.println(data);
    }
}
