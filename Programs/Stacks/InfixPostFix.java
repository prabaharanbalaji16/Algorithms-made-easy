package Stacks;

import java.util.Stack;

public class InfixPostFix {
    public static void main(String[] args) {
        InfixPostFix infixPostFix = new InfixPostFix();
        infixPostFix.convert("A*B-(C+D)+E");
    }

    void convert(String exp)
    {
        Stack<Character> stack = new Stack<Character>();
        String result = new String("");
        for(int i=0;i<exp.length();++i)
        {
            if(Character.isLetterOrDigit(exp.charAt(i)))
            {
                result+=exp.charAt(i);
            }
            else if(exp.charAt(i)=='(')
            {
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(' )
                {
                    result+=stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && prec(exp.charAt(i))<=prec(stack.peek()))
                {
                    result+=stack.peek();
                    stack.pop();
                }
                stack.push(exp.charAt(i));
            }
            System.out.println(result);
        }

        while(!stack.isEmpty())
        {
            if(stack.peek() =='(')
            {
                // return;
                stack.pop();
            }
            else
            {
                result+= stack.peek();
                stack.pop();
            }
        }
        System.out.println(result);
    }

    int prec(char c)
    {
        switch(c){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
            
            case '^':
                return 3;
        }
        return -1;
    }
}
