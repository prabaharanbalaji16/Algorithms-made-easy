package Stacks;

import java.util.Stack;

public class Spans2 {
    public static void main(String[] args) {
        Spans2 spans = new Spans2();
        int arr[] = {6,3,4,5,2};
        spans.execute(arr);
    }
    void execute(int[] arr)
    {
        int[] spans = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        int p=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                p=-1;
            }
            else
            {
                p = stack.peek();
            }
            spans[i] = i-p;
            stack.push(i);
            System.out.println(p);
            System.out.println(stack);
        }

        for(int s:spans)
        {
            System.out.println(s);
        }
    }
}
