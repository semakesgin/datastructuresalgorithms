package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(1);

       // queue.enqueue(2);
        queue.printQueue();
        System.out.println("Silindikten sonra:");
        queue.dequeue();
        queue.printQueue();
    }

}