package dev.kaldiroglu.java.ip.solution.ch11;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    private static long miliSeconds;

    public static void main(String[] args) {
        System.out.println("Please enter a number to which to list prime numbers:");
        Scanner sc = new Scanner(System.in);
        int upperBound = sc.nextInt();
        boolean[] isPrime = listPrimes(upperBound);

        // count primes
        int primes = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime[i]) {
//				System.out.println(i);
                primes++;
            }
        }

        long seconds = (int) miliSeconds/1000;
        System.out.println("There are " + primes + " prime numbers up to " + upperBound + ".");
        System.out.println("Time to find them: " + seconds + " s. or " + miliSeconds + " ms.");
    }

    public static boolean[] listPrimes(int upperBound) {

        // initially assume all integers are prime
        boolean[] isPrime = new boolean[upperBound + 1];
//		for (int i = 2; i <= upperBound; i++) {
//			isPrime[i] = true;
//		}
        Arrays.fill(isPrime, true);

        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);

        long start = System.currentTimeMillis();

        // mark non-primes <= upperBound using Sieve of Eratosthenes
        for (int i = 2; i <= upperBoundSquareRoot; i++) {
            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider multiples i, i+1, ..., upperBound/i
            if (isPrime[i]) {
                for (int j = i; i * j <= upperBound; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        long end = System.currentTimeMillis();
        miliSeconds = end-start;

        return isPrime;
    }
}
