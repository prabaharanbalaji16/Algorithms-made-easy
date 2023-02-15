package Trees;
// Recursive
public class SizeofTree
{
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
        int leftCount = root.left==null ? 0:findSize(root.left);
        int rightCount = root.right==null ? 0: findSize(root.right);
        return 1+leftCount+rightCount;
    }
}