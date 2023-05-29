package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        public int getValue() {
            return value;
        }

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node removed = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            removed.prev = null;
            length--;
        }
        return removed;

    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node removed = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            removed.next = null;
            length--;
        }
        return removed;

    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        else {
            Node temp = head;
            if (index < length / 2) {
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                temp = tail;
                for (int i = length - 1; i > index; i--) {
                    temp = temp.prev;
                }
            }

            return temp;
        }
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node != null) {
            node.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
        }
        if (index == length) {
            append(value);
        } else {
            Node temp = new Node(value);
            Node nodeAtIndex = get(index);
            temp.prev = nodeAtIndex.prev;
            temp.prev.next = temp;
            temp.next = nodeAtIndex;
            nodeAtIndex.prev = temp;
            length++;
        }
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        } else {
            Node temp = get(index);
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.prev = null;
            temp.next = null;
            length--;
            return temp;
        }
    }
    public void swapFirstLast(){
        if(length >=2 ){
            int headVal= head.value;
            head.value = tail.value;
            tail.value = headVal;
        }
    }
    public void reverse(){
        if(length>=2){
        Node temp = head;
        head = tail;
        tail = temp;
        while (temp != null){
            Node next = temp.next;
            Node prev = temp.prev;

            temp.prev = next;
            temp.next = prev;

            temp = next;
        }

        }

    }
    public boolean isPalindrome(){
        if(length%2 ==0 || head.value != tail.value ){
            return false;
        }else{
            Node tempFromHead = head;
            Node tempFromTail = tail;
            for (int i = 0; i < length/2; i++) {
                if(tempFromHead.value != tempFromTail.value){
                    return false;
                }
                tempFromHead = tempFromHead.next;
                tempFromTail =tempFromTail.prev;
            }
            return true;
        }
    }
    public void swapPairs(){
        if(length>=2){
            Node firstNode = head;
            Node secondNode = head.next;
            head = secondNode;
            while(firstNode != null && secondNode != null){
                Node secondNext = secondNode.next;
                Node firstPre = firstNode.prev;

                firstNode.prev =secondNode;
                firstNode.next =secondNext;
                if(secondNext != null) {
                    secondNext.prev = firstNode;
                }
                secondNode.next = firstNode;
                secondNode.prev = firstPre;
                if(firstPre != null){
                    firstPre.next = secondNode;
                }
                firstNode = secondNext;
                if(secondNext != null){
                    secondNode= secondNext.next;
                }
            }

        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
