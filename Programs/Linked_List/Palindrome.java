public class Palindrome{

    public static void main(String args[])
    {
        PalindromeNode one = new PalindromeNode("M");
        PalindromeNode two = new PalindromeNode("A");
        PalindromeNode three = new PalindromeNode("D");
        PalindromeNode four = new PalindromeNode("A");
        PalindromeNode five = new PalindromeNode("M");

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        two.prev = one;
        three.prev = two;
        four.prev = three;
        five.prev = four;
        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome(one))
        {
            System.out.println("It is Palindroe");
        }
        else
        {
            System.out.println("It is not a Palindroe");
        }
    }

    Boolean isPalindrome(PalindromeNode head)
    {
        PalindromeNode slow = head;
        PalindromeNode fast = head;

        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        PalindromeNode midRight = slow.next;
        PalindromeNode midLeft = slow.prev;

        while(midLeft!=null && midRight!=null)
        {
            if(midLeft.item == midRight.item)
            {
                midLeft = midLeft.prev;
                midRight = midRight.next;
            }
            else
            {
                return false;
            }
        }

        return true;

    }
}
class PalindromeNode{
    String item;
    PalindromeNode next;
    PalindromeNode prev;

    PalindromeNode(){}

    PalindromeNode(String item)
    {
        this.item = item;
        next = null;
        prev = null;
    }
}