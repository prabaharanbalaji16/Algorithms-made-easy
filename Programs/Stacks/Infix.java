package Stacks;
import java.util.Stack;

public class Infix{
    public static void main(String[] args) {
        Infix infix = new Infix();
        infix.eval("2*(2+12)/7");
    }
    void eval(String exp)
    {
        Stack<Character> operator = new Stack<Character>();
        Stack<Integer> operand = new Stack<Integer>();

        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(Character.isDigit(c))
            {
                operand.push(Integer.parseInt(Character.toString(c)));
                System.out.println(operand.peek());
            }
            else if(c =='(')
            {
                operator.push(c);
            }
            else if(c=='+' || c=='-'|| c =='*' || c=='/')
            {
                System.out.println("In");
                while(!operator.isEmpty() && prec(c) <= prec(operator.peek()))
                {
                    int result = ops(c, operand.pop(), operand.pop());
                    operand.push(result);
                }
                operator.push(c);
                System.out.println(operator.peek());
            }
            else if(c==')')
            {
                while(operator.peek()!='(')
                {
                    int result = ops(operator.peek(),operand.pop(),operand.pop());
                    operand.push(result);
                    operator.pop();
                }
                operator.pop();
            }
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
    int ops(char op, int n1, int n2)
    {
        switch(op)
        {
            case '+':
                return n1+n2;
            case '-':
            return n1-n2;
            case '*':
                return n1*n2;
            case '/':
            return n1/n2;
        }
        return -1;
    }
}