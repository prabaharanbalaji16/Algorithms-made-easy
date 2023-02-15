package Trees;

public class HeightOfTree {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println(heightOfTree.findHeight(root));
    }

    int findHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return (leftHeight>rightHeight)?leftHeight+1:rightHeight+1;
    }
}
