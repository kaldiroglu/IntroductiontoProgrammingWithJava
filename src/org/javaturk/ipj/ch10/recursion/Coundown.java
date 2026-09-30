package org.javaturk.ipj.ch10.recursion;

public class Coundown {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Counting down from " + n);
		coundown(n);
		System.out.println();
		countdownRecursively(n);
	}

	public static void coundown(int n) {
		System.out.println("in countdown()");
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void countdownRecursively(int n) {
		System.out.println("in countdownRecursively()");
		System.out.println(n);
		if (n == 0) // Base case
			return;
		else
			countdownRecursively(n - 1);
	}
}
