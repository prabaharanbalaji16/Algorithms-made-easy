package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Deleting2 {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        Deleting2 deleting = new Deleting2();
        deleting.delete(root,5);
        deleting.delete(root,7);
    }

    void delete(Node root,int data)
    {
        Node toDelete = null;
        Node temp=null;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            temp = queue.poll();

            if(temp.data == data)
            {
                toDelete = temp;
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
        toDelete.data = temp.data;
        Node deepNode = temp;
        temp = null;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty())
        {
            temp = queue.poll();
            if(temp.left!=null)
            {
                if(temp.left==deepNode)
                    temp.left = null;
                else
                    queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                if(temp.right == deepNode)
                    temp.right = null;
                else
                    queue.add(temp.right);
            }
        }
    }
}


