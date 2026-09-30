package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

public class PrimeNumbers {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number <= 0)
            System.out.println("Number must be a positive integer.");
        else {
            int numberOfPrimes = 0;
            for (int i = 2; i <= number; i++) {
                if (isPrime(i))
                    numberOfPrimes++;
            }
            System.out.println("Number of primes up to " + number + " : " + numberOfPrimes);
        }
    }

    static boolean isPrime(int number) {
        if (number < 2) // 1 is not a prime.
            return false;
        else {
            int squareRoot = (int) Math.sqrt(number) + 1;
            for (int i = 2; i < squareRoot; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
}
