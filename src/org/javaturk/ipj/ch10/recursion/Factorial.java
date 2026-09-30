package org.javaturk.ipj.ch10.recursion;

public class Factorial {
    static long factorial = 1;

    public static void main(String[] args) {
        int n = 10;

        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is " + factorial + "\n");

        factorial = calculateFactorialRecursively(n);
        System.out.println("Factorial of " + n + " is " + factorial + "\n");

    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }

    public static long calculateFactorialRecursively(int n) {
        if (n == 1)
            factorial = 1;
        else
            factorial = n * calculateFactorialRecursively(n - 1);
        return factorial;
    }
}
