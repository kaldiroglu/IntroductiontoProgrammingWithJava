
package org.javaturk.ipj.ch06.conversion;

public class WideningConversion {

	public static void main(String[] args) {
		byte b = 126;
		short s = 1000;
		char c = 65;
		int i = 2_147_483_647;
		long l;
		float f;
		double d;
		/*
		 * c = b; // compile error: possible loss of precision c = s; // compile
		 * error: possible loss of precision i = d; // compile error: possible
		 * loss of precision
		 */

		System.out.println("\n ***   No-loss of Precision   ***\n");
		s = b;
		System.out.printf("s:%d   b:%d \n", s, b);

		l = i;
		System.out.printf("l:%d   i:%d \n", l, i);

		i = c;
		System.out.printf("i:%d   c:%c \n", i, c);

		f = i;
		System.out.printf("f:%f   i:%d \n", f, i);

		d = i;
		System.out.printf("d:%f   i:%d \n", d, i);

		f = 3.1415f;
		d = f;
		System.out.printf("d:%f   f:%f \n", d, f);

		System.out.println("\n ***   Loss of Precision   ***\n");

		// Loss of precision
		l = 987_654_321_123_456_789L;
		f = l;
		System.out.printf("f:%f   l:%d \n", f, l);
		
		d = l;
		System.out.printf("d:%f   l:%d \n", d, l);

		// No loss of precision
		d = f;
		System.out.printf("d:%f   f:%f \n", d, f);
	}
}
