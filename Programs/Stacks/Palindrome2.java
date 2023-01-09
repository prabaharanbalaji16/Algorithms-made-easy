package Stacks;

import java.util.Stack;

public class Palindrome2 {
    public static void main(String[] args) {
        Node one = new Node("M");
        Node two = new Node("A");
        Node three = new Node("D");
        Node four = new Node("A");
        Node five = new Node("M");

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Palindrome2 palindrome = new Palindrome2();
        if(palindrome.check(one))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }

    boolean check(Node head)
    {
        Node head1 = head;
        Stack<String> stack = new Stack<String>();
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node leftNode = head1;
        Node rightNode = slow.next;
        Node midNode = slow;

        while(leftNode!=midNode)
        {
            stack.push(leftNode.item);
            leftNode = leftNode.next;
        }

        while(rightNode!=null)
        {
            if(stack.pop()==rightNode.item)
            {
                rightNode = rightNode.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}

class Node
{
    String item;
    Node next;

    Node(){};

    Node(String item)
    {
        this.item = item;
        next = null;
    }
}