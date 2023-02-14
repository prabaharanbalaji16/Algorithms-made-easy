package Trees;

import java.util.LinkedList;
import java.util.Queue;


public class Inserting {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.left.left.right = new Node(8);
        root.right.left = new Node(1);
        root.right.right = new Node(6);
        

        Inserting inserting = new Inserting();
        root= inserting.insert(root,10);

        inserting.print(root);
    
    }
    Node insert(Node root,int data)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();

            if(temp!=null)
            {
                if(temp.left!=null)
                {
                    queue.offer(temp.left);
                }
                else
                {
                    temp.left = new Node(data);
                    return root;
                }
                if(temp.right!=null)
                {
                    
                    queue.offer(temp.right);
                }
                else
                {
                    temp.right = new Node(data);
                    return root;
                }
            }
        }
        return root;
    }

    void print(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null && temp.right!=null)
            {
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
    }
}
