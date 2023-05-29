package datastructures.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printQueue(){
        Node temp = first;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0){
            first=newNode;
            last= newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if(length>0){
        Node temp = first;
        first = temp.next;
        temp.next =null;
        length--;
        return temp;
        }
        return null;
    }
}
