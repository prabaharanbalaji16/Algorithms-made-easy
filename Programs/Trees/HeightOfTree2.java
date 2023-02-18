package Trees;

import java.util.Stack;

public class HeightOfTree2 {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(9);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(6);

        HeightOfTree2 heightOfTree = new HeightOfTree2();
        System.out.println(heightOfTree.findHeight(root));
    }   

    int findHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        int height =0;
        Node prev = null;
        while(!stack.isEmpty())
        {
            Node curr = stack.peek();
            if(prev==null || prev.left==curr|| prev.right== curr)
            {
                if(curr.left !=null)
                {
                    stack.push(curr.left);
                }
                else if(curr.right!=null)
                {
                    stack.push(curr.right);
                }
            }
            else if(curr.left == prev)
            {
                    if(curr.right!=null)
                    {
                        stack.push(curr.right);
                    }
                    
            }
            else

            {
                stack.pop();
            }

            prev = curr;

            if(height < stack.size())
            {
                height = stack.size();
            }
        }
        return height;
    }
}
