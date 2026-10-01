
package dev.kaldiroglu.java.ip.ch09;

class RangeComparison {

	public static void main(String[] args) {
		int i = 5;

		// boolean b = 3 < i < 7; // Illegal!

		boolean b = (3 < i) & (i < 7);
		System.out.println(b);

	}
}
