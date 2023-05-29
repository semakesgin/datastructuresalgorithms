package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack (int value){
        Node node = new Node(value);
        top = node;
        height=1;
    }


    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public void push (int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        height ++;
    }

    public Node pop(){
        if(height >0){
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
        }return null;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
