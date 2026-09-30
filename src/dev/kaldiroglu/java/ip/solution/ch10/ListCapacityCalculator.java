
package dev.kaldiroglu.java.ip.solution.ch10;

/**
 * @author akin
 * 
 *         Calculates the new capacities until it passes 1000 of a list with a
 *         given capacity.
 * @see java.util.ArrayList and its following methods: boolean add(E e) -> void add(E e, Object[] elementData, int s) -> Object[] grow() -> Object[] grow(int minCapacity)
 * @see https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 */
public class ListCapacityCalculator {

	public static void main(String[] args) {
		int oldCapacity6 = 10;

		if (args.length == 1)
			oldCapacity6 = Integer.parseInt(args[0]);

		int oldCapacity7 = oldCapacity6;

		System.out.println("Initial Capacity both for Java 6 and Java 7 & 8 is " + oldCapacity6);

		int newCapacity6 = 0;
		int newCapacity7 = 0;
		System.out.println("Java 6    Java 7 & 8");
		System.out.println("---------------------");

		while (newCapacity6 < 1000 | newCapacity7 < 1000) {
			newCapacity7 = oldCapacity7 + (oldCapacity7 >> 1);
			oldCapacity7 = newCapacity7;

			newCapacity6 = oldCapacity6 * 3 / 2 + 1;
			oldCapacity6 = newCapacity6;

			System.out.format("%-5d %10d %n", newCapacity6, newCapacity7);
		}
	}
}
