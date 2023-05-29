package datastructures.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(52);
//        bst.insert(82);
//
//        bst.rinsert(27);
//
//        System.out.println(bst.minValue(bst.root.right));
        bst.rinsert(2);
        bst.rinsert(1);
        bst.rinsert(3);

        /**
         *   2
         *  / \
         *1     3
         *
         */
        System.out.println("\nRoot:"+bst.root.value);
        System.out.println("Root->Left:"+bst.root.left.value);
        System.out.println("Root->Right:"+bst.root.right.value);

        bst.deleteNode(2);
        /**
         *   3
         *  / \
         *1     null
         *
         */
        System.out.println("\nRoot:"+bst.root.value);
        System.out.println("Root->Left:"+bst.root.left.value);
        System.out.println("Root->Right:"+bst.root.right.value);


    }
}