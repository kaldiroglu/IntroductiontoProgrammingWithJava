package org.javaturk.ipj.ch10.loop;

public class FibonacciNumbers {
    public static void main(String[] args) {
        fibonacciNumbers(50);
    }

    static void fibonacciNumbers(long count) {
        System.out.println("\nFibonacci Numbers");

        long f0 = 1;
        long f1 = 1;
        long fibonacciNumber;

        System.out.format("%20d\n", f0);
        System.out.format("%20d\n", f1);
        for (int i = 3; i <= count; i++) {
            fibonacciNumber = f0 + f1;
            System.out.format("%20d\n", fibonacciNumber);
            f0 = f1;
            f1 = fibonacciNumber;
        }
    }
}
