package Queues;

import java.util.Stack;

public class Consecutive {
    public static void main(String[] args) {
        Consecutive consecutive = new Consecutive();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(5);
        stack.push(-2);
        stack.push(-3);
        stack.push(11);
        stack.push(10);
        stack.push(5);
        stack.push(6);
        stack.push(20);

        consecutive.find(stack);
    }

    void find(Stack<Integer> stack)
    {
        if(stack.size()%2!=0)
        {
        stack.pop();
        }
        while(!stack.isEmpty())
        {
           int temp = stack.pop();
           if(stack.peek()-temp==1 || stack.peek()-temp==-1)
           {
                System.out.println("("+temp+","+stack.pop()+")");
           }
           else
           {
            stack.pop();
           }
        }
        
    }
}

