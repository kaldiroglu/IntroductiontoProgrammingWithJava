package org.javaturk.ipj.project.solution.stack;

import java.util.Arrays;

/**
 * This class is an implementation abstract data type stack. It holds only String elements.
 * It has a limited size and does not grow or shrink.
 */
public class Stack {
	// Default maximum stack size
	private final int capacity;
	private boolean full = false;
	private boolean empty = true;

	// Backing array
	private String[] array;

	// Always points to first empty cell
	private int pointer = 0;

	public Stack(int capacity){
		this.capacity = capacity;
		array = new String[capacity];
	}

	/**
	 * Push the element into the stack. Notice that this stack has a limited capacity and does not grow automatically so when it is full this method returns false.
	 * @return true if element is added, false otherwise.
 	 */
	public boolean push(String element) {
		if (!full) {
			array[pointer] = element;
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
	 * Pop the element out of the stack. The element is removed from the stack when this method is called.
	 * @return The element on the top of the stack
	 */
	public String pop() {
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
	 * Peeks into the element on the top of the stack. The element is NOT removed from the stack when this method is called.
	 * @return The element on the top of the stack
	 */
	public String peek() {
		if (!empty) {
			return array[pointer - 1];
		}
		else return null;
	}

	/**
	 * Removes all elements from the stack. The stack becomes empty when this method is called.
	 */
	public void clear() {
		Arrays.fill(array, null);
		pointer = 0;
		empty = true;
		full = false;
	}

	/* Stack status operations */

	/**
	 * Checks if the stack is empty
	 * @return true if the stack is empty false otherwise
	 */
	public boolean isEmpty() {
		return empty;
	}

	/**
	 * Checks if the stack is full
	 * @return true if the stack is full false otherwise
	 */
	public boolean isFull() {
		return full;
	}

	/**
	 * Returns number of elements in the stack
	 * @return int Number of elements in the stack
	 */
	public int size() {
		return pointer;
	}

	/**
	 * Returns max number of elements the stack can have
	 * @return int capacity of the stack
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Lists elements in the stack.
	 */
	public void showElements() {
		System.out.println("\n*** Elements in the Stack ***");
		if (!empty)
			for (String s : array) {
				if (s != null)
					System.out.println(s);
			}
		else
			System.out.println("Nothing in the Stack!");
		System.out.println();
	}
}
