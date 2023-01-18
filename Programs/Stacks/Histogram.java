package Stacks;

import java.util.Stack;

public class Histogram
{
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        int[] height = {3,2,5,6,1,4,7,4};
        histogram.findMax(height,1);
    }

    void findMax(int[] height, int width)
    {
        int i=0;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(i<height.length)
        {
            if(stack.empty() || stack.peek()<=height[i])
            {
                stack.push(i++);
            }
            else
            {
                int top = stack.pop();
                maxArea = Math.max(maxArea, top*width);
            }
        }

        while(!stack.isEmpty())
        {
            int top = stack.pop();
            maxArea = Math.max(maxArea, top*width);
        }
        System.out.println(maxArea);
    }
}