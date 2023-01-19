package Stacks;

import java.util.Stack;

public class AdjacentDuplicate {
    public static void main(String[] args) {
        AdjacentDuplicate duplicate = new AdjacentDuplicate();
        int[] arr = {1,5,6,8,8,8,0,1,1,0,6,5};
        int arr2[] = {1,9,6,8,8,8,0,1,1,0,6,5};
        duplicate.find(arr2);
    }

    void find(int[] arr)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int i=0;
        while(i<arr.length)
        {
            if(stack.isEmpty() || stack.peek() != arr[i])
            {
                stack.push(arr[i]);
                i++;
            }
            else
            {
                while(i<arr.length && stack.peek() == arr[i])
                {
                    i++;
                }
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
