package org.javaturk.ipj.project.solution.stack;

public class StackTest {

    public static void main(String[] args) {
//        run0();
        run1();
       run2();
    }
    public static void run0() {
        System.out.println("run0");
        int capacity = 10;
        Stack stack = new Stack(capacity);

        stack.push("One");
        System.out.println("Popped value: " + stack.pop());

        stack.push("One");
        System.out.println("Size: " + stack.size());
        stack.showElements();

        stack.push("two");
        stack.showElements();
        System.out.println("Size: " + stack.size());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Size: " + stack.size());
        stack.showElements();
    }

    public static void run1() {
        System.out.println("run1");
        int size = 10;
        Stack stack = new Stack(size);

        System.out.println("Capacity: " + stack.getCapacity());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Size: " + stack.size());

        System.out.println();

        for (int i = 0; i <= size; i++) {
            System.out.println(stack.push("" + i));
        }

        System.out.println();

        System.out.println("Capacity: " + stack.getCapacity());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Size: " + stack.size());
        stack.showElements();

        stack.clear();

        System.out.println();

        System.out.println("Capacity: " + stack.getCapacity());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Size: " + stack.size());
        stack.showElements();

    }

    public static void run2() {
        int capacity = 10;
        Stack stack = new Stack(capacity);
        for (int i = 0; i <= capacity; i++) {
            System.out.println(stack.push("" + i));
        }

        System.out.println();

        for (int i = 0; i <= capacity; i++) {
            System.out.println("Popped value: " + stack.pop());
        }

        System.out.println();

        for (int i = 0; i <= capacity; i++) {
            System.out.println(stack.push("" + i));
        }

        String poppedValue;
        while((poppedValue = stack.pop()) != null)
            System.out.println("Popped value: " + poppedValue);
    }
}