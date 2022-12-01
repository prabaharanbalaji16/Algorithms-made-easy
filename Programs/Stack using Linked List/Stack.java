/**
 * Stack
 */
public class Stack {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(6);
        linkedList.push(8);
        System.out.println(linkedList.pop());
        linkedList.push(10);
        linkedList.push(7);
        System.out.println(linkedList.pop());
    }
}

class LinkedList{

    Node first = null;

    private class Node{
        private int item;
        private Node next;
    }
    void push(int i){
        Node oldFirst = first;
        first = new Node();
        first.item = i;
        first.next = oldFirst;
    }

    int pop(){
        int popped = first.item;
        first.next=first;
        return popped;
    }
}