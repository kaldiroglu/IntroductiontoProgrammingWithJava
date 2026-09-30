package org.javaturk.ipj.ch06.numbers;

public class Integers {

    public static void main(String[] args) {

        byte lowestByte = -128;
        byte highestByte = 127;
        System.out.println("Range of byte is from " + lowestByte + " to " + highestByte);
        System.out.printf("Range of byte is from %.0f to %.0f \n", (-Math.pow(2, 7)), (Math.pow(2, 7)-1));

        short lowestShort = -32768;
        short highestShort = 32767;
        System.out.println("\nRange of short is from " + lowestShort + " to " + highestShort);
        System.out.printf("Range of short is from %.0f to %.0f \n", (-Math.pow(2, 15)), (Math.pow(2, 15)-1));

        int lowestInt = -2147483648;
        int highestInt = 2147483647;
        System.out.println("\nRange of int is from " + lowestInt + " to " + highestInt);
        System.out.println("Range of int is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.printf("Range of int is from %.0f to %.0f \n", (-Math.pow(2, 31)), (Math.pow(2, 31)-1));

        long lowestLong = -9223372036854775808L;
        long highestLong = 9223372036854775807L;
        System.out.println("\nRange of long is from " + lowestLong + " to " + highestLong);
        System.out.println("Range of long is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // %.0f formats the double with no decimal places.
        // Math.pow(2, 63) returns 9.223372036854776E18 which loses some precision. It is in fact 9223372036854775808.
        System.out.printf("Range of long is from %.0f to %.0f \n", (-Math.pow(2, 63)), (Math.pow(2, 63)-1));
    }
}
