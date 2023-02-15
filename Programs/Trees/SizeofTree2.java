package Trees;

import java.util.LinkedList;
import java.util.Queue;
// Iterative
public class SizeofTree2 {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        SizeofTree size = new SizeofTree();
        System.out.println(size.findSize(root));
    }

    int findSize(Node root)
    {
        int count=0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            count ++;
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
        return count;
    }
}
