package Trees;

public class MaximumElemet {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        MaximumElemet max = new MaximumElemet();
        System.out.println( max.findMax(root));
    }

    int findMax(Node root)
    {
        int max=0;

        if(root!=null)
        {
            int leftMax = findMax(root.left);
            int rightMax = findMax(root.right);

            if(leftMax > rightMax)
                max = leftMax;
            else
                max = rightMax;

            if(root.data > max)
                max = root.data;
        }
        return max;
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
    }
}