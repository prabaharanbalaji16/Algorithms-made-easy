package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElement2
{
    public static void main(String args[])
    {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        MaximumElement2 max = new MaximumElement2();
        System.out.println( max.findMax(root));
    }
    int findMax(Node root)
    {
        int max = 0;
        Queue<Node> queue = new LinkedList<Node>();
        
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();

            if(temp.data>max)
            {
                max = temp.data;
            }

            if(temp.left!=null && temp.right !=null)
            {
                queue.add(temp.left);
                queue.add(temp.right);
            }
            
        }
        return max;
    }
}