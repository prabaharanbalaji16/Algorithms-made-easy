package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        DeepestNode deepestNode = new DeepestNode();
        System.out.println(deepestNode.find(root));
    }

    int find(Node root)
    {
        Node temp=null;
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            temp = queue.poll();

            if(temp.left!=null)
            {
                queue.add(temp.left);
            }

            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }

        return temp.data;
    }

}
