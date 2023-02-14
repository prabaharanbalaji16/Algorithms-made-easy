package Trees;

import java.util.Queue;

import java.util.LinkedList;

public class Searching2 {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        Searching2 searching = new Searching2();
        if(searching.search(root,6))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    boolean search(Node root, int k)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp.data==k)
            {
                return true;
            }
            if(temp.left!=null && temp.right!=null)
            {
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
       return false;
    }
}
