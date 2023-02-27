package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintPath {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        PrintPath printPath = new PrintPath();
        printPath.print(root);
    }

    void print(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();

            if(temp!=null)
            {
                System.out.print(temp.data+" ");

                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
        }
    }
}
