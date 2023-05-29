package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//
//       /*System.out.println(myLinkedList.removeFirst().value);
//        System.out.println("After removed:");
//        myLinkedList.printList();
//
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());*/
//        myLinkedList.reverseBetween(0,5);
//        System.out.println("Eklenmiş List");
//        myLinkedList.printList();


        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4

        */
    }

}