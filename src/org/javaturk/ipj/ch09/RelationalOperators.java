
package org.javaturk.ipj.ch09;

import java.util.*;

public class RelationalOperators {

	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt() % 100;
		int j = rand.nextInt() % 100;

		prt("i = " + i);
		prt("j = " + j);
		prt("i > j is " + (i > j));
		prt("i < j is " + (i < j));
		prt("i >= j is " + (i >= j));
		prt("i <= j is " + (i <= j));
		prt("i == j is " + (i == j));
		prt("i != j is " + (i != j));
		
		System.out.println();
		
		char c1 = 'a';
		char c2 = 'x';
		prt("a > x is " + (c1 > c2));
		prt("a < x is " + (c1 < c2));
		
		c1 = 's';
		c2 = 'ğ';
		prt("s > ğ is " + (c1 > c2));
		
		c1 = 'ü'; // 0x00FC
		c2 = 'ı'; // 0x0131
		prt("ü < ı is " + (c1 < c2));

		System.out.println();
		
		boolean b1 = true;
		boolean b2 = false;
		if (b1 == b2)
			prt("Equal");
		else
			prt("Not equal");
		
		if (b1)
			prt("true!");

		byte aByte = 10;
		char aChar = 10;
		short aShort = 10;
		int anInt = 10;
		long aLong = 10;
		float aFloat = 10f;
		double aDouble = 10.0;

		System.out.println("\nAre All Same?");
		boolean same = aByte == aChar;
		System.out.println(same);
		same = aShort == anInt;
		System.out.println(same);
		same = aLong == aFloat;
		System.out.println(same);
		same = aDouble == aByte;
		System.out.println(same);

		
		System.out.println();
		
		String s1 = new String("String");
		String s2 = new String("String");
		
//		s1 = s2;
		
		if (s1 == s2)
			prt("The same");
		else
			prt("Different");

		Car car = getMeACar();
		if(car != null)
			car.go(100);
		else System.out.println("Ref is null!");
	}

	static void prt(String s) {
		System.out.println(s);
	}

	static Car getMeACar(){
		double d = Math.random();
		if(d < 0.25)
			return new Car();
		else
			return null;
	}
}
