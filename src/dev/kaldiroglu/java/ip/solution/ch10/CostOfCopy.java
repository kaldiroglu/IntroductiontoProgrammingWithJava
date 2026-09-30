
package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

/**
 * 1 copy: 5 Cent, 12 copies: 50 Cents, 25 copies: 1 Euro.
 * Write a method that calculates the minimum cost for a given number of
 * copies. Do the same thing with a recursive method.
 */
public class CostOfCopy {

	private static int cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of pages to copy:");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Number must be a positive integer.");
		} else
			cost = calculateCost(number);
		System.out.println("Cost of copy of " + number + " pages is " + cost);
	}

	public static int calculateCost(int n) {
		if (n >= 25) {
			int twentyFives = n / 25;
			cost += twentyFives * 100;
			n = n % 25;
		}
		if (n >= 12) {
			int twelves = n / 12;
			cost += twelves * 50;
			n = n % 12;
		}
		if (n > 0)
			cost += 5 * n;
		return cost;
	}

	public static int calculateCostRecursively(int n) {
		if (n >= 25) {
			n = n - 25;
			cost += 100;
			calculateCostRecursively(n);
		} else if (n >= 12) {
			n = n - 12;
			cost += 50;
			calculateCostRecursively(n);
		} else {
			cost += 5 * n;
		}
		return cost;
	}
}
