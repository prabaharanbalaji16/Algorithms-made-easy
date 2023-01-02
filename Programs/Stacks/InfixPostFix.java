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
        for(int i=0;i<exp.length();i++)
        {
            if(Character.isLetterOrDigit(exp.charAt(i)))
            {
                System.out.print(exp.charAt(i));
            }
            else if(exp.charAt(i)=='(')
            {
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    System.out.print(stack.pop());
                }
            }
            else
            {
                while(!stack.isEmpty() && prec(exp.charAt(i))<prec(stack.peek()))
                {
                    System.out.print(stack.pop());
                }
                stack.push(exp.charAt(i));
            }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
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
