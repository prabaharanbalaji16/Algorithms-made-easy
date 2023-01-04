import java.util.Stack;

public class PostFix{
    public static void main(String args[])
    {
        PostFix postFix = new PostFix();
        postFix.eval("123*+5-");
    }

    void eval(String exp)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int result=0;
        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            
            if(Character.isDigit(c))
            {
                stack.push(c-'0');
            }
            else if(c=='*')
            {
                int num2 = stack.pop();
                int num1 = stack.pop();

                result = (num1*num2);
                stack.push(result);
            }
            else if(c=='+')
            {
                int num2 = stack.pop();
                int num1 = stack.pop();

                result = (num1+num2);
                stack.push(result);
            }
            else if(c=='-')
            {
                int num2 = stack.pop();
                int num1 = stack.pop();

                result = (num1-num2);
                stack.push(result);
            }
            else if(c=='/')
            {
                int num2 = stack.pop();
                int num1 = stack.pop();

                result = (num1/num2);
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }
}