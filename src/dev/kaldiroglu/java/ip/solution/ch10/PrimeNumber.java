package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

public class PrimeNumber {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number <= 0)
            System.out.println("Number must be a positive integer.");
        else {
            boolean prime = true;
            int divider = 1;
            if (number < 2) // 1 is not a prime.
                prime = false;
                // In fact there is no need for this if statement.
            else if (number == 2) // 2 is a prime
                prime = true;
            else {
                int squareRoot = (int) Math.sqrt(number) + 1;
                for (int i = 2; i < squareRoot; i++) {
                    if (number % i == 0) {
                        prime = false;
                        divider = i;
                        break;
                    }
                }
            }
            if (prime)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number, divided by " + divider);
        }
    }
}
