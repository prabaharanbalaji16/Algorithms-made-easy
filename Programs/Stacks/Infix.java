package Stacks;
import java.util.Stack;

public class Infix{
    public static void main(String[] args) {
        Infix infix = new Infix();
        infix.eval("1 + 2 * 6");
    }
    void eval(String exp)
    {
        Stack<Character> operator = new Stack<Character>();
        Stack<Integer> operand = new Stack<Integer>();

        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(c== '(')
            {
                operator.push(c);
            }
            else if(Character.isDigit(c))
            {
                operand.push(c - '0');
            }
            else if(c==')')
            {
                while(operator.peek()!='(')
                {
                    int result = ops(operator.pop(), operand.pop(), operand.pop());
                    operand.push(result);
                }
                operator.pop();
            }
            else if(c=='+' || c == '-' || c=='*'||c=='/')
            {
                while(operator.size() >0  && prec(c) <= prec(operator.peek()))
                {
                    int result = ops(operator.pop(), operand.pop(), operand.pop());
                    operand.push(result);
                }
                operator.push(c);
            }

        }

        while(!operator.isEmpty())
                {
                    int result = ops(operator.pop(), operand.pop(), operand.pop());
                    operand.push(result);
                }
        System.out.println(operand.pop());
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
    int ops(char op, int a, int b)
    {
        switch(op)
        {
            case '+':
                return b+a;
            case '-':
            return b-a;
            case '*':
                return b*a;
            case '/':
            return b/a;
        }
        return 0;
    }
}