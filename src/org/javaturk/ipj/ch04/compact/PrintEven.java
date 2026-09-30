/*
 * We see here 3 enhancements that came with JDK 25:
 * - No need to declare a class for valid Java code, a main method is enough
 * - No need to declare main methods as public static void main(String[] args),
 *   now it is much more succint: void main()
 * - No need to use System.out to print, now we can use IO.println()
 */

void main() {
    int n = 100;
    for (int i = 1; i < n; i++)
        if (i % 2 == 0)
            IO.println(i);
}