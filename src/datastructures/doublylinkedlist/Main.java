package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        myDLL.append(4);
//        myDLL.append(5);
//
//
//        myDLL.printList();
////        System.out.println("Silinen: "+myDLL.removeFirst().getValue());
//       System.out.println("Ekledikten sonra:");
////
//        myDLL.reverse();
//       myDLL.printList();

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

    }
}