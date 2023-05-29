package datastructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(2);
        stack.push(1);
        stack.printStack();
        System.out.println("Silinen:"+ stack.pop().value);
        stack.printStack();

    }
}