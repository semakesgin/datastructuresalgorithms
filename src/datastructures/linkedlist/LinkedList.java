package datastructures.linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        else {
            Node removed = head;
            head = head.next;
            removed.next = null;
            length--;
            if (length == 0) {
                tail = null;
            }
            return removed;
        }
    }

    public Node get(int index) {
        if (index >= length || index < 0) return null;
        else if (index == length - 1) return tail;
        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index > length || index < 0) return false;
        else {
            if (index == 0) {
                prepend(value);
            } else if (index == length) {
                append(value);
            } else {
                Node node = new Node(value);
                Node temp = get(index - 1);
                node.next = temp.next;
                temp.next = node;
                length++;
            }
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length) {
            return removeLast();
        }
        Node beforeRemovedNode = get(index - 1);
        Node removedNode = beforeRemovedNode.next;
        beforeRemovedNode.next = removedNode.next;
        removedNode.next = null;
        length--;
        return removedNode;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp=after;
        }
    }
    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while (slow != null
                && fast != null
                && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
            return slow;
    }

    boolean detectLoop()
    {
        Node slowPointer = head,
                fastPointer = head;

        while (slowPointer != null
                && fastPointer != null
                && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer)
                return true;
        }

        return false;
    }
    public Node findKthFromEnd(int k) {
        Node mainPtr = head;
        Node refPtr = head;
        for (int i = 1; i < k; i++) {
            refPtr = refPtr.next;
        }
        while (refPtr.next != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        return mainPtr;
    }
    public void reverseBetween(int m, int n) {
        if((m>=0 && m<length) && (n>= 0 && n <length)) {
            Node preM = head;
            Node preN = head;
            for (int i = 1; i < m ; i++) {
                preM = preM.next;
            }
            for (int j = 1; j < n ; j++) {
                preN = preN.next;
            }
            Node nodeMnext = preM.next.next;
            Node nodeNnext = preN.next.next;
            Node nodeM = preM.next;

            preM.next = preN.next;
            preM.next.next = nodeMnext;

            preN.next = nodeM;
            preN.next.next =nodeNnext;
        }
    }

    public void partitionList(int x) {
        if(head == null) return;
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        Node prev1 =dummy1;
        Node prev2 =dummy2;

        Node current = head;
        while(current != null){
            if(current.value <x){
                prev1.next = current;
                prev1 =current;
            }else{
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;

        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }
    public void removeDuplicates() {
        Set<Integer> hashset = new HashSet<>();

        Node node = head;
        Node prev = null;
        while (node != null){
            int currVal= node.value;
            if(hashset.contains(currVal)){
                prev.next = node.next;
            }else{
                hashset.add(currVal);
                prev =node;
            }
            node=node.next;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
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
