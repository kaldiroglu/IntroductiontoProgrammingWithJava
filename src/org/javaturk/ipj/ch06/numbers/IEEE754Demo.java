package org.javaturk.ipj.ch06.numbers;

import java.math.BigDecimal;

public class IEEE754Demo {

    public static void main(String[] args) {
        representInIEEE754Form(0.625);
        representInIEEE754Form(0.1);
        representInIEEE754Form(-0.625);
    }

    static void representInIEEE754Form(double value) {
        System.out.println("\nRepresenting: " + value);
        System.out.println("Value in reality: " + new BigDecimal(value));

        // Get the 64-bit representation as a long
        long bits = Double.doubleToRawLongBits(value);

        // Format it to show all 64 bits (including leading zeros)
        String bitString = String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');

        System.out.print("Full 64-bit sequence: ");
        System.out.println(bitString);

        // Breakdown
        String sign = bitString.substring(0, 1);
        String exponent = bitString.substring(1, 12);
        String mantissa = bitString.substring(12);

        System.out.println("IEEE 754 Representation:");
        System.out.println("Sign:     " + sign);
        System.out.println("Exponent: " + exponent + " (Decimal: " + (Integer.parseInt(exponent, 2) - 1023) + ")");
        System.out.println("Mantissa: " + mantissa);
    }
}
