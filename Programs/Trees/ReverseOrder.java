package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrder {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        ReverseOrder reverseOrder = new ReverseOrder();
        reverseOrder.reverse(root);
    }

    void reverse(Node root)
    {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
            stack.push(temp.data);
        }
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
