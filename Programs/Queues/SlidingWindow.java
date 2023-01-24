package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    
    public static void main(String[] args) {
        int arr[] = {12,1,78,90,57,89,56};
        int K=3;

        SlidingWindow slidingWindow = new SlidingWindow();
        slidingWindow.find(arr,arr.length,K);
    }

    void find(int[] arr,int n,int K)
    {
        Deque<Integer> dq = new LinkedList<Integer>();
        int i;
        for(i=0;i<K;++i)
        {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(;i<n;++i)
        {
            System.out.println(arr[dq.peek()]);

            while((!dq.isEmpty()) && dq.peek() <= i-K)
            {
                dq.removeFirst();
            }

            while((!dq.isEmpty()) && arr[i]>=arr[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);
    }
}
