package dev.kaldiroglu.java.ip.solution.ch11;

import java.util.Arrays;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 * </p>
 * This algorithm finds unique elements in an int array without distorting the
 * order. If the input array is int array[] = {3, 3, 87, 56, 1, 87, 3, 2 } then
 * output array would be int array[] = {3, 87, 56, 1, 2 }
 */
public class ArrayWithUniqueElements {

    public static void main(String[] args) {
        int array[] = {3, 3, 87, 56, 1, 87, 3, 2};
        for (int i : array)
            System.out.print(i + "-");
        System.out.println();

        int newArray[] = findUniqueElements1(array);

        for (int i : newArray)
            System.out.print(i + "-");
    }

    public static int[] findUniqueElements1(int[] a) {
        int[] f = new int[a.length];
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[j] == a[i])
                    f[j] = 1;
        int len = 0;
        for (int i = 0; i < f.length; i++)
            if (f[i] == 0)
                len = len + 1;
        int[] b = new int[len];
        int ind = 0;
        for (int i = 0; i < f.length; i++)
            if (f[i] == 0) {
                b[ind] = a[i];
                ind = ind + 1;
            }
        return b;
    }

    public static int[] findUniqueElements2(int[] a) {
        int[] tmpArray = new int[a.length];
        int tmpArrayIndex = 0;
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            if (!included(tmpArray, key)) {
                tmpArray[tmpArrayIndex] = key;
                tmpArrayIndex++;
            }
        }
        int[] newArray = Arrays.copyOf(tmpArray, tmpArrayIndex);
        return newArray;
    }

    private static boolean included(int array[], int key) {
        boolean included = false;
        for (int i : array) {
            if (i == key) {
                included = true;
                break;
            }
        }
        return included;
    }
}

