package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class FullNodes{
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        FullNodes fullNodes = new FullNodes();
        fullNodes.find(root);
    }

    void find(Node root)
    {
        Queue<Node> queue   = new LinkedList<Node>();
        int count = 0;
        int fullNode = 0;
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp.left!=null && temp.right!=null)
            {
                fullNode++;
            }
            if(temp.left!=null)
            {
                count++;
                queue.add(temp.left);
            }

            if(temp.right!=null)
            {
                count++;
                queue.add(temp.right);
            }

            }
        System.out.println(count);
        System.out.println(fullNode);
    }
}