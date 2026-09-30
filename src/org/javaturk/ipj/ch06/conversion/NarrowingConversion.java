
package org.javaturk.ipj.ch06.conversion;

public class NarrowingConversion {

	public static void main(String args[]) {
		System.out.println();
		byte b = 0;
		short s = 1000;
		char c;
		int i = -100;
		long l = 100_000_000_000L;
		float f = 65.5541_233f;
		double d = 98.014_353_459_485_483d;

		// b = s; // compile error: possible loss of precision
		// c = i; // compile error: possible loss of precision
		// f = d; // compile error: possible loss of precision

		b = (byte) s;
		System.out.printf("b:%d s:%d \n", b, s);
		
		i = (int) l; 	// Loss of info
		System.out.printf("i:%d l:%d \n", i, l);
		
		i = (int) d;
		System.out.printf("i:%d d:%f \n", i, d);
		
		i = (int) f;  	// Loss of floating point info
		System.out.printf("i:%d f:%f \n", i, f);
		
		l = (long) f;	// Loss of floating point info
		System.out.printf("l:%d f:%f \n", l, f);
		
		f = (float) d;	// Loss of info
		System.out.printf("f:%20.20f d:%20.20f \n", f, d);
		
		i= 65;
		c = (char) i;
		System.out.println("i: " + i + "\t\t\tc: " + c);

		i= 65;
		c = (char) -i; // 65,536 is added to make it positive
		System.out.println("c: " + (int)c + "\t\tc: " + c);
		
		i= -65471; // add 65536 to -65471, result is 65 and then char value would be
		c = (char) i;
		System.out.printf("c:%c  i:%d \n", c, i);
	}
}
