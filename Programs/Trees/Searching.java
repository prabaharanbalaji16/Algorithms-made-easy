package Trees;

public class Searching {

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        Searching searching = new Searching();
        if(searching.search(root,7))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    boolean search(Node root, int k)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==k)
        {
            return true;
        }
        return search(root.left, k) || search(root.right, k);
    }
}
