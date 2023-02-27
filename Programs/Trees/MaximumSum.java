package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        MaximumSum maximumSum = new MaximumSum();
        maximumSum.find(root);
    }
    void find(Node root)
    {
        int result=0;
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            int count = queue.size();
            int sum=0;
            while(count-- >0)
            {
                Node temp = queue.poll();
                sum+=temp.data;
                
                    if(temp.left!=null)
                    {
                        queue.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        queue.add(temp.right);
                    }
            }
            result = Math.max(result, sum);
        }
        System.out.println(result);
    }
}
