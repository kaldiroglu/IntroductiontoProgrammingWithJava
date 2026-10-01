package dev.kaldiroglu.java.ip.ch09;

class OverloadedAndOr {
    public static void main(String[] args) {
        int i = 5, j = 12, k = 28;
        boolean b = (i < j) & (i > k);
        System.out.println(b);

        k = i & j;
        System.out.println(k);
        System.out.println("\n0" + Integer.toBinaryString(i) + "\n &\n" + Integer.toBinaryString(j) + "\n =\n0" + Integer.toBinaryString(k));
        System.out.printf("\n0%-4s \n & \n%-4s \n =\n0%-4s\n", Integer.toBinaryString(i), Integer.toBinaryString(j), Integer.toBinaryString(k));
    }
}
