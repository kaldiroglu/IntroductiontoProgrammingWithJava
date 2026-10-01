/*
 * We see here 3 enhancements that came with JDK 25:
 * - No need to declare a class for valid Java code, a compact method is enough
 * - No need to declare compact methods as public static void compact(String[] args),
 *   now it is much more succint: void compact()
 * - No need to use System.out to print, now we can use IO.println()
 */

void main() {
    int n = 100;
    for (int i = 1; i < n; i++)
        if(i % 2 == 0)
            IO.println(i);
}