import java.util.Hashtable;

public class RandomList {
    public static void main(String[] args) {
        RandomNode one = new RandomNode(1);
        RandomNode two = new RandomNode(2);
        RandomNode three = new RandomNode(3);
        RandomNode four = new RandomNode(4);
        RandomNode five = new RandomNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        one.random = three;
        two.random = four;
        three.random = five;
        four.random = one;
        five.random = two;

        RandomList randomList = new RandomList();
        RandomNode node = randomList.Clone(one);

        while(node!=null)
        {
            System.out.print(node.item);
            System.out.print("->");
            if(node.next == null)
            {
                System.out.print("null");
            }
            else
            {
                System.out.print(node.next.item);
            }
            System.out.print("->");
            System.out.print(node.random.item);
            System.out.println();
            node = node.next;
        }
    }

    RandomNode Clone(RandomNode head)
    {
        Hashtable<RandomNode,RandomNode> randomTable = new Hashtable<RandomNode,RandomNode>();
        RandomNode x = head;
        RandomNode y;

        while(x!=null)
        {
            y = new RandomNode(x.item);
            y.next = null;
            y.random = null;
            randomTable.put(x, y);
            x = x.next;
        }

        x = head;


        while(x!=null)
        {
            y = randomTable.get(x);
            if(x.next == null)
            {
                y.next = null;
            }
            else
            {
                y.next = randomTable.get(x.next);
            }
            y.random = randomTable.get(x.random);
            x = x.next;
        }
        return randomTable.get(head);
    }
}

class RandomNode{
    int item;
    RandomNode next;
    RandomNode random;

    RandomNode(){};
    RandomNode(int item){
        this.item = item;
    };
    RandomNode(RandomNode next){
        this.next = next;
    };
}