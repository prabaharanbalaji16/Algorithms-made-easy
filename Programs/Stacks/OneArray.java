package Stacks;

public class OneArray
{
    int[] stack;
    int stackOne ;
    int stackTwo;
    public OneArray(int size)
    {
        stack = new int[size];
        stackOne = -1;
        stackTwo = size;
    }
    public static void main(String[] args) {
        OneArray array = new OneArray(4);

        array.push(1, 1);
        array.push(1, 2);
        array.push(2, 1);
        array.push(2, 2);
        array.print();
        // array.push(1, 3);
        System.out.println();
        System.out.println();

        array.pop(1);
        array.print();

        System.out.println();
        System.out.println();

        array.pop(1);
        array.print();

    }

    void push(int stackId,int data)
    {
        if(stackTwo==stackOne+1)
        {
                System.out.println("Stack is full");
                System.exit(0);
        }
        if(stackId==1)
        {
            stack[++stackOne] = data;
        }
        else if(stackId==2)
        {
            stack[--stackTwo] = data;
        }
        
    }

    int pop(int stackId)
    {
        int pop=-1;
        if(stackId==1)
        {
            if(stackOne>=0)
            {
                pop = stack[stackOne];
                stack[stackOne--] = -1;
            }
            else
            {
                System.out.println("Stack 1 is empty");
            }
        }
        else if(stackId==2)
        {
            if(stackTwo!=stack.length)
            {
                pop = stack[stackTwo];
                stack[stackTwo++] = -1;
            }
            else
            {
                System.out.println("Stack 2 is empty");
            }
        }

        return pop;
    }
    void print()
    {
        System.out.print("Stack One: ");
        for(int i=0;i<=stackOne;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
        System.out.print("Stack Two: ");
        for(int i=stack.length-1;i>=stackTwo;i--)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}