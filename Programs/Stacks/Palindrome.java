package Stacks;

public class Palindrome
{
    public static void main(String args[])
    {
        Palindrome palindrome = new Palindrome();
        char str[] = {'M','A','D','D','A','M'};
        palindrome.check(str);
    }

    void check(char[] str)
    {
        int i = 0, j = str.length-1;
        while(i<j && str[i]==str[j])
        {
            System.out.println(str[i]);
            System.out.println(str[j]);
            i++;
            j--;
        }

        if(i<j)
        {
            System.out.println("Not a Palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }
        
    }
}