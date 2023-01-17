package Stacks;

import java.util.Stack;

public class StringProcessing
{
    String str="";
    StringProcessing(String str)
    {
        this.str = str;
    }
    public static void main(String[] args)
    {
        StringProcessing stringProcessing = new StringProcessing("SSSXSXSXXSXX");
        stringProcessing.process();
    }

    void process()
    {
        Stack<Integer> stack = new Stack<Integer>();
        int val = 0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c=='S')
            {
                stack.push(++val);
            }
            else if(c=='X')
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    throw new NullPointerException("Stack is Empty");
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Not Admissiable");
        }
        else
        {
            System.out.println("Admissible");
        }
    }
}