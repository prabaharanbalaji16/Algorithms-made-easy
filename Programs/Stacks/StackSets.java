package Stacks;

import java.util.ArrayList;

public class StackSets {

    int threshold;
    ArrayList<StackForStackSets> listOfStacks = new ArrayList<StackForStackSets>();

    public StackSets(int threshold)
    {
        this.threshold = threshold;
    }
    public static void main(String[] args) {
        StackSets stacks= new StackSets(3);
        stacks.push(10);stacks.push(9);stacks.push(8);
        stacks.push(7);stacks.push(6);stacks.push(5);
        stacks.push(4);stacks.push(3);stacks.push(2);

        System.out.println(stacks.pop());
        System.out.println(stacks.pop(2));

        // System.out.println(stacks);
    }

    // public String toString()
    // {
    //     String s="";

    //     for(int i=0;i<listOfStacks.size();i++)
    //     {
    //         StackForStackSets stack = listOfStacks.get(i);
    //         s=stack.toString()+s;
    //     }
    //     return s;
    // }
    public StackForStackSets getLastStack()
    {
        int size = listOfStacks.size();
        if(size<=0)
        {
            return null;
        }
        return listOfStacks.get(size-1);
    }

    StackForStackSets getNthStack(int n)
    {
        if(listOfStacks.size()<=0)
        {
            return null;
        }
        return listOfStacks.get(n-1);
    }

    void push(int data)
    {
        StackForStackSets lastStack = this.getLastStack();
        if(lastStack==null)
        {
            lastStack = new StackForStackSets(threshold);
            lastStack.push(data);
            listOfStacks.add(lastStack);
        }
        else{
            if(!lastStack.capacity())
            {
                lastStack.push(data);
            }
            else
            {
                StackForStackSets newLastStack = new StackForStackSets(threshold);
                newLastStack.push(data);
                listOfStacks.add(newLastStack);
            }
        }
    }

    int pop()
    {
        StackForStackSets lastStack = listOfStacks.get(listOfStacks.size()-1);
        int data = lastStack.pop();
        if(lastStack.size()==0)
            listOfStacks.remove(lastStack);
        return data;
    }

    int pop(int n)
    {
        StackForStackSets lastStack = listOfStacks.get(n-1);
        int data = lastStack.pop();
        if(lastStack.size()==0)
            listOfStacks.remove(lastStack);
        return data;
    }
}
class StackForStackSets
{
    int top=-1;
    int[] arr;
    int capacity;
    StackForStackSets(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    
    void push(int data)
    {
        arr[++top] = data;
    }

    int pop()
    {
        return arr[top--];
    }

    boolean capacity()
    {
        return capacity == top+1;
    }
    int size()
    {
        return top+1;
    }

    public String toString()
    {
        String s="";
        int index = top;
        while(index>=0)
        {   
            s+=arr[index];
        }
        return s;
    }
}