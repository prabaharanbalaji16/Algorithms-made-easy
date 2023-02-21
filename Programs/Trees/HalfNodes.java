package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class HalfNodes {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        // root.left.right = new Node(4);
        root.right.left = new Node(1);
        // root.right.right = new Node(6);

        HalfNodes halfNodes = new HalfNodes();
        halfNodes.find(root);
    }

    void find(Node root)
    {
        Queue<Node> queue   = new LinkedList<Node>();
        int count = 0;
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp.left==null && temp.right!=null)
            {
                count++;
            }
            else if(temp.left!=null && temp.right==null)
            {
                count++;
            }
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }

            if(temp.right!=null)
            {
                queue.add(temp.right);
            }

            }
        System.out.println(count);
    }
}
