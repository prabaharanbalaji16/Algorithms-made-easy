public class Problem7{
    public static void main(String[] args) {
        Node head =  new Node(10);

        Node l1 = new Node(17);
        head.next = l1;

        Node l2 = new Node(33);
        l1.next = l2;

        Node l3 = new Node(41);
        l2.next = l3;
        Node l4 = new Node(92);
        l3.next = l4;
        l4.next = null;


        Node node = new Node();
        node.detectLoop(head);
    }
    
    }

class Node{
        int item;
        Node next;
        static int N=0;

        Node()
        {

        }

        Node( int item)
        {
            this.item = item;
            this.next = null;
            N++;
        }

        void detectLoop(Node head)
        {
            int n=N;
            
            for(int i=0;i<n;i++)
            {
                Node pointer = head.next;
                for(int j=1;j<n;j++)
                {
                    
                    try {
                        if(head==pointer.next)
                        {
                            System.out.println("loop found");
                            return;
                        }
                    } catch (NullPointerException e) {
                        System.out.println("Null Terminated");
                    }
                                        
                    pointer = pointer.next;
                }
                head = head.next;
            }
        }
    }

    