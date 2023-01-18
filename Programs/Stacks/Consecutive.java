package Stacks;

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
        consecutive.pair(stack);
    }
    void pair(Stack<Integer> stack)
    {
        int i=0;
        
        while(!stack.isEmpty())
        {
            int temp = stack.pop();
            System.out.println(temp);
            System.out.println(stack.peek());
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
