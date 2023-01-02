package Stacks;
import java.util.Stack;



public class SymbolPattern {

    public boolean pattern(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {   
            if(s.charAt(i)==')')
            {
                if(!stack.isEmpty() && stack.peek()==(Object)'(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(!stack.isEmpty() && stack.peek() == (Object)'[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(!stack.isEmpty() && stack.peek() == (Object)'{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }

        }
        if(stack.isEmpty())
            {
                return true;
            }
            else
            {
                return false;
            }
    }

    public static void main(String[] args) {
        SymbolPattern symbolPattern = new SymbolPattern();
        boolean result = symbolPattern.pattern("()(()[()])");
        System.out.println(result);
    }
}
