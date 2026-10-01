package dev.kaldiroglu.java.ip.ch11;

import java.util.Random;

/**
 * This class demonstrates the bubble sort algorithm.
 *It sorts the array in place. No new array is created.
 * The method implements bubble sort:
 * It walks through the array multiple times.
 * On each pass, it compares neighboring elements.
 * If array[j] > array[j + 1], it swaps them.
 * After each outer pass, the largest remaining value has “bubbled” to the end.
 *
 * The temporary variable temp is used for swapping two values safely.
 * So the effect of sort(array) is that the random numbers printed before it become ordered from smallest to largest when printed after it.
 * One practical note: bubble sort is simple but slow on large arrays, with O(n^2) time complexity.
 * In bubble sort, each full pass pushes the largest remaining value to the end.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(25);
        print(array);
        sort(array);
        print(array);
    }

    public static void sort(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) { // Iterate starting from the first element.
            for (int j = 0; j < length - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp; // Larger value moves to the right.
                }
            }
        }
    }

    public static int[] createArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0; i < length; i++)
            array[i] = random.nextInt(1_000);
        return array;
    }

    public static void print(int[] array){
        System.out.println("\nPrinting array:");
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
