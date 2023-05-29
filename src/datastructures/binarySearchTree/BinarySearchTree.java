package datastructures.binarySearchTree;

public class BinarySearchTree {
    Node root;


    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {

            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else if (value == temp.value) return true;
        }

        return false;
    }

    public boolean rcontains(int value) {
        return rcontains(root, value);
    }

    public boolean rcontains(Node node, int value) {
        if (node == null) return false;
        else if (value == node.value) return true;
        if (value < node.value) {
            return rcontains(node.left, value);
        }
        return rcontains(node.right, value);
    }

    public void rinsert(int value) {
        if (root == null) root = new Node(value);
        rinsert(root, value);
    }

    public Node rinsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rinsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rinsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {//sileceğimiz nodu bulduk.
            if (currentNode.left == null && currentNode.right == null) {//hiç yaprağı yoksa
                return null;
            } else if (currentNode.left == null) {//sağda yaprağı varsa
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {//solda yaprağı varsa
                currentNode = currentNode.left;
            }else{//hem sağ hem solda yaprağı varsa sağdaki en küçük değer silinen nodeun yerine geçer.
                // en küçük değer eski yerinden silinir.
                int subTreeMin = minValue(currentNode.right);
                currentNode.value= subTreeMin;
                currentNode.right =deleteNode(currentNode.right,subTreeMin);

            }
        }
        return currentNode;
    }
    public int minValue(Node currentNode){
        if(currentNode == null) return 0;
        if(currentNode.left == null) return currentNode.value;
        else{
            return minValue(currentNode.left);
        }
    }

}
