package Stacks;

public class OneArray2 {
    int size;
    int[] stack;

    int firstTop, secondTop,thirdTop,baseThird;
    OneArray2(int size)
    {   
        stack = new int[size];
        firstTop = -1;
        secondTop = size;
        baseThird = size/2;
        thirdTop = size/2;
    }
    public static void main(String[] args) {

        OneArray2 array = new OneArray2(7);

        array.push(1,1);
        array.push(1,2);
        // array.push(1,3);
        array.push(2,1);
        array.push(3,1);
        array.push(3,2);
        array.push(2,2);
        array.print();
        
        System.out.println();
        array.pop(2);
        array.print();

        System.out.println();
        array.pop(2);
        array.print();


        System.out.println();
        array.pop(1);
        array.print();

        System.out.println();
        array.pop(1);
        array.print();

        System.out.println();
        array.pop(3);
        array.pop(3);
        array.print();

        array.pop(2);

    }

    void push(int stackId, int data)
    {
        if(stackId==1)
        {
            if(firstTop+1 == baseThird)
            {
                if(isThirdRightShiftable())
                {
                    shiftThirdToRight();
                    stack[++firstTop] = data;
                }
                else
                {
                    throw new StackOverflowError("Stack 1 is full");
                }
            }
            else
            {
                stack[++firstTop] = data;
            }
        }
        else if(stackId==2)
        {
            if(secondTop-1 == thirdTop)
            {
                if(isThirdLeftShiftable())
                {
                    shiftThirdToLeft();
                    stack[--secondTop] = data;
                }
                else
                {
                    throw new StackOverflowError("Stack 2 is full");
                }
            }
            else
            {
                stack[--secondTop] = data;
            }
         }
        else if(stackId==3)
        {
            if(secondTop-1 == thirdTop)
            {
                if(isThirdLeftShiftable())
                {
                    shiftThirdToLeft();
                    stack[++thirdTop] = data;
                }
                else
                {
                    throw new StackOverflowError("Stack 3 is full");
                }
            }
            else
            {
                stack[++thirdTop] = data;
            }
        }
    }
    int pop(int stackId)
    {
        int popped = 0;
        if(stackId==1)
        {
            if(firstTop ==-1)
            {
                throw new NullPointerException("Stack 1 is empty");
            }
            else
            {
                
                popped = stack[firstTop];
                stack[firstTop--]=0;
                return popped;
            }
        }
        else if(stackId==2)
        {
            if(secondTop == stack.length )
            {
                throw new NullPointerException("Stack 2 is empty");
            }
            else
            {
                popped = stack[secondTop];
                stack[secondTop++]=0;
                return popped;
            }
        }
        else if(stackId==3)
        {
            if(thirdTop ==size/2 && stack[thirdTop]==0)
            {
                throw new NullPointerException("Stack 3 is empty");
            }
            else
            {
                popped = stack[thirdTop];
                if(thirdTop > baseThird) stack[thirdTop--]=0;
                if(thirdTop == baseThird) stack[thirdTop]=0;
                return popped;
            }
        }
        return -1;
    }
    boolean isThirdRightShiftable()
    {
        if(thirdTop+1 < secondTop)
        {
            return true;
        }
        return false;
    }
    void shiftThirdToRight()
    {
        for(int i=thirdTop+1;i>=baseThird+1;i--)
        {
            stack[i] = stack[i-1];
        }
        stack[baseThird++] = 0;
        thirdTop++;
    }
    boolean isThirdLeftShiftable()
    {
        if(firstTop+1<baseThird)
        {
            return true;
        }
        return false;
    }

    void shiftThirdToLeft()
    {
        for(int i=baseThird-1;i<=thirdTop-1;i++)
        {
            stack[i] = stack[i+1];
        }
        stack[thirdTop--] =0;
        baseThird--;
    }
    void print()
    {
        for(int i=0;i<stack.length;i++)
        {
            System.out.println(stack[i]);
        }
    }
}
