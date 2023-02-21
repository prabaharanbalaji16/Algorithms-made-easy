package Trees;

public class Diameter {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(1);
        // root.right.right = new Node(6);

        Diameter diameter = new Diameter();
        System.out.println(diameter.find(root));
    }

    int find(Node root)
    {
        int left,right,diameter = 0;
        if(root == null)
        {
            return 0;
        }
        left = find(root.left);
        right = find(root.right);

        if(left+right > diameter)
        {
            diameter = left+right;
        }
        return Math.max(left,right)+1;
    }
}
