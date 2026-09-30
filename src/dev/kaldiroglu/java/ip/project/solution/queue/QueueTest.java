package dev.kaldiroglu.java.ip.project.solution.queue;

public class QueueTest {

    public static void main(String[] args) {
//        run0();
        run1();
//       run2();
    }
    public static void run0() {
        System.out.println("run0");
        int capacity = 10;
        Queue queue = new Queue(capacity);

        System.out.println(queue.enqueue("One"));
        System.out.println("Dequeued value: " + queue.dequeue());

        System.out.println(queue.enqueue("One"));
        System.out.println("Size: " + queue.size());
        queue.showElements();

        System.out.println(queue.enqueue("two"));
        queue.showElements();

        System.out.println("Size: " + queue.size());
        System.out.println("Dequeued value: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        queue.showElements();
    }

    public static void run1() {
        System.out.println("run1");
        int size = 10;
        Queue queue = new Queue(size);

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());

        System.out.println();

        for (int i = 0; i <= size; i++) {
            System.out.println(queue.enqueue("" + i));
        }

        System.out.println();

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());

        queue.showElements();

        queue.clear();

        System.out.println();

        System.out.println("Capacity: " + queue.getCapacity());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Size: " + queue.size());
        queue.showElements();

    }

    public static void run2() {
        int capacity = 10;
        Queue queue = new Queue(capacity);
        for (int i = 0; i <= capacity; i++) {
            System.out.println(queue.enqueue("" + i));
        }

        System.out.println();

        for (int i = 0; i <= capacity; i++) {
            System.out.println("Dequeued value: " + queue.dequeue());
        }

        System.out.println();

        for (int i = 0; i <= capacity; i++) {
            System.out.println(queue.enqueue("" + i));
        }

        String poppedValue;
        while((poppedValue = queue.dequeue()) != null)
            System.out.println("Dequeued value: " + poppedValue);
    }
}