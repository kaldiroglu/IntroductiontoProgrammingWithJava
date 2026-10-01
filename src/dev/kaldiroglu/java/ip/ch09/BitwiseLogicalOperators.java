package dev.kaldiroglu.java.ip.ch09;

public class BitwiseLogicalOperators {

	public static void main(String[] args) {
		
		int i = 7; // 0100
		int j = 4; // 1000
		
		int k = i & j;
		System.out.println(i + " & " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();
		
		k = i | j;
		System.out.println(i + " | " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();
		
		k = i ^ j;
		System.out.println(i + " ^ " + j + " = " + k);
		System.out.println(getBinary(i) + " & " + getBinary(j) + " = " + getBinary(k));
		
		System.out.println();

		k = ~ i;
		System.out.println(" ~ " + i + " = " + k);
		System.out.println("~ " + getBinary(i) + " = " + getBinary(k));

		System.out.println();
		
		long u = 6; // 0110
		long v = 2; // 0010
//		int w = u & v; // Needs cast!
//		int w = (int) (u & v);
		long w = u & v;
		System.out.println(u + " & " + v + " = " + w);
		System.out.println(getBinary(u) + " & " + getBinary(v) + " = " + getBinary(w));
		
		System.out.println();
		
		byte m = 6;
		byte n = 2;
//		byte l = m & n;
		byte l = (byte) (m & n);
		System.out.println(m + " & " + n + " = " + l);
		System.out.println(getBinary(m) + " & " + getBinary(n) + " = " + getBinary(l));
		
		System.out.println();
		
		long cL = ~l;
		System.out.println("l  = " + l + ", cL = " + ~l);
		System.out.println("l = " + getBinary(l) + ", ~l = " + getBinary(cL));
	}
	
	public static String getBinary(int i) {
		return Integer.toBinaryString(i);
	}
	
	public static String getBinary(long l) {
		return Long.toBinaryString(l);
	}
}
