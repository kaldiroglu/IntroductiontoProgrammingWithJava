package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        System.out.println("Prime factors of " + number + " are : ");
        int squareRoot = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < squareRoot; i++) {
            while (number % i == 0) { // i is a factor of number
                System.out.print(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }
}
