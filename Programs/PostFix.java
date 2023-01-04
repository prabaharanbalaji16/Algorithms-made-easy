import java.util.Stack;

public class PostFix{
    public static void main(String args[])
    {
        PostFix postFix = new PostFix();
        postFix.eval("123*+5-");
    }

    void eval(String exp)
    {
        Stack<Character> stack = new Stack<Character>();
        Character result=null;
        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            
            if(Character.isLetterOrDigit(c))
            {
                stack.push(c);
            }
            else if(c=='*')
            {
                int num1 = stack.pop();
                int num2 = stack.pop();

                result = (char) (num1*num2);
                stack.push(result);
            }
            else if(c=='+')
            {
                int num1 = stack.pop();
                int num2 = stack.pop();

                result = (char) (num1+num2);
                stack.push(result);
            }
            else if(c=='-')
            {
                int num1 = stack.pop();
                int num2 = stack.pop();

                result = (char) (num1-num2);
                stack.push(result);
            }
            else if(c=='/')
            {
                int num1 = stack.pop();
                int num2 = stack.pop();

                result = (char) (num1/num2);
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }
}