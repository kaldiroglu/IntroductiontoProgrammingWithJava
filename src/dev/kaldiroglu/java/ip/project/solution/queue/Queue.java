package dev.kaldiroglu.java.ip.project.solution.queue;

import java.util.Arrays;

/**
 * This class is an implementation abstract data type queue. It holds only String elements.
 * It has a limited size and does not grow or shrink.
 */
public class Queue {
    // Default maximum stack size
    private final int capacity;
    private boolean full = false;
    private boolean empty = true;

    // Backing array
    private String[] array;

    // Always points to first empty cell
    private int pointer = 0;

    public Queue(int capacity) {
        this.capacity = capacity;
        array = new String[capacity];
    }

    /**
     * Push the element into the queue. Notice that this queue has a limited capacity and does not grow automatically so when it is full this method return false.
     * @return true if element is added, false otherwise.
     */
    public boolean enqueue(String element) {
        if (!full) {
            shift();
            array[0] = element;
            pointer++;
            if (empty)
                empty = false;
            if (pointer == capacity)
                full = true;
            return true;
        } else
            return false;
    }

    /**
     * Dequeue the element out of the queue. The element is removed from the queue when this method is called.
     * @return The element at the front of the queue
     */
    public String dequeue() {
        String lastItem = null;
        if (!empty) {
            lastItem = array[pointer - 1];
            array[pointer - 1] = null;
            pointer--;
            if (pointer != capacity)
                full = false;
            if (pointer == 0)
                empty = true;
        }
        return lastItem;
    }

    /**
     * Peeks into the element at the front of the queue. The element is NOT removed from the queue when this method is called.
     *
     * @return The element at the front of the queue
     */
    public String peek() {
        if (!empty) {
            return array[pointer - 1];
        } else throw new IllegalStateException();
    }

    /**
     * Removes all elements from the queue. The queue becomes empty when this method is called.
     */
    public void clear() {
        Arrays.fill(array, null);
        pointer = 0;
        empty = true;
        full = false;
    }

    /* Queue status operations */

    /**
     * Checks if the queue is empty
     * @return true if the queue is empty false otherwise
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * Checks if the queue is full
     * @return true if the queue is full false otherwise
     */
    public boolean isFull() {
        return full;
    }

    /**
     * Returns number of elements in the queue
     *
     * @return int Number of elements in the queue
     */
    public int size() {
        return pointer;
    }

    /**
     * Returns max number of elements the queue can have
     *
     * @return int capacity of the queue
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Lists elements in the queue.
     */
    public void showElements() {
        System.out.println("\n*** Elements in the Queue ***");
        if (!empty)
            for (String s : array) {
                if (s != null)
                    System.out.println(s);
            }
        else
            System.out.println("Nothing in the Queue!");
        System.out.println();
    }

    /**
     * Shifts existing elements to their right cell starting from the element at the front. It is called when a new element is enqueued.
     */
    private void shift() {
        for (int i = pointer; i > 0; i--)
            array[i] = array[i - 1];
    }
}
