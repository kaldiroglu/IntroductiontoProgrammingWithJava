package org.javaturk.ipj.ch10.recursion;

public class Sum {
    static int sum;
    static int i;

    public static void main(String[] args) {
        sum(25);
        sumRecursively(25);
    }

    public static void sum(int n) {
        System.out.println("in sum()");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println("Sum: " + sum);
        }
        System.out.println("Sum of numbers up to " + n + " is " + sum + "\n");
    }

    public static void sumRecursively(int n) {
//        System.out.println("in sumRecursively()");
        sum += n;
        System.out.println("Sum: " + sum);
        n--;
        if (n == 0) // Base case
            return;
        else
            sumRecursively(n);
    }
}
