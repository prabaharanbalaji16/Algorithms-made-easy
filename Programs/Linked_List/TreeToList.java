
class Nodes{
    int data;
    Nodes left;
    Nodes right;
    Nodes(){}
    Nodes(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
public class TreeToList {
    // Nodes root;
    Nodes head,prev;
    public static void main(String[] args) {
        TreeToList tree = new TreeToList();
        Nodes root = new Nodes(10);
        root.left = new Nodes(12);
        root.left.left = new Nodes(25);
        root.left.right = new Nodes(30);
        root.right = new Nodes(15);
        root.right.left = new Nodes(36);

        tree.convertToList(root);
        tree.print(tree.head);
    }

    void convertToList(Nodes root)
    {
        if(root==null)
            return;
        convertToList(root.left);
        if(prev == null)
        {
            head = root;
        }
        else
        {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertToList(root.right);
    }

    void print(Nodes head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.right;
        }
    }
}
