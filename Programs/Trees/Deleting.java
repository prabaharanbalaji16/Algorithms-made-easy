package Trees;

public class Deleting {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        Deleting deleting = new Deleting();
        deleting.delete( root);
        System.out.println("Tree deleted");
    }
    void delete(Node root)
    {
        root = null;

    }
}
