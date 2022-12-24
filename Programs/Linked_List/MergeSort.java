public class MergeSort {
    public static void main(String[] args) {
        Node head1 = new Node(20);
        Node head2 = new Node(12);
        Node head3 = new Node(2);
        Node head4 = new Node(7);
        Node head5 = new Node(16);
        Node head6 = new Node(4);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        MergeSort mergeSort = new MergeSort();
        Node merged = mergeSort.sort(head1);

        while(merged!=null)
        {
            System.out.println(merged.item);
            merged = merged.next;
        }
    }

    Node sort(Node head)
    {
        if(head ==null || head.next==null)
        {
            return head;
        }
        // two halves
        Node mid = findMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sort(left);
        right = sort(right);

        Node merged = merge(left,right);

        return merged;
    }

    Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node merge(Node left, Node right)
    {
        if(left ==null)
        {
            return right;
        }

        if(right == null)
        {
            return left;
        }
        Node result = new Node(-1);
        Node temp = result;

        while(left!=null && right!=null)
        {
            if(left.item < right.item)
            {
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }

        while(left!=null)
        {
            temp.next = left;
            temp = left;
            left = left.next;
        }

        while(right!=null)
        {
            temp.next = right;
            temp = right;
            right = right.next;
        }

        return result.next;
    }
}

