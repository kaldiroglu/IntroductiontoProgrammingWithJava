package org.javaturk.ipj.ch06.numbers;

public class FPBinaryConverter {
    public static void main(String[] args) {
        printBinary(1.0);
        printBinary(0.625);
        // Use 0.1 to see the infinite repeating pattern differences
        printBinary(0.1);
        printBinary(1.0/3.0);
    }

    static void printBinary(double number) {
        System.out.println("\nDecimal Value: " + number);

        // 1. Show the MATH (Successive Multiplication)
        System.out.println("Manual (32 iterations):   " + toManualBinary(number, 32));
        System.out.println("Manual (64 iterations):   " + toManualBinary(number, 64));

        // 2. Show the HARDWARE (IEEE 754 Standard)
        System.out.println("IEEE 754 (32-bit Float):  " + toLibrary32((float) number));
        System.out.println("IEEE 754 (64-bit Double): " + toLibrary64(number));
    }

    public static String toManualBinary(double number, int precision) {
        // 1. Handle the sign
        String sign = (number < 0) ? "-" : "";
        double absNumber = Math.abs(number);

        // 2. Separate Integer and Fractional parts
        long integerPart = (long) absNumber;
        double fractionalPart = absNumber - integerPart;

        // 3. Convert Integer Part (Whole numbers)
        String intBinary = Long.toBinaryString(integerPart);

        // 4. Convert Fractional Part (Successive Multiplication)
        StringBuilder fracBinary = new StringBuilder();
        if (fractionalPart > 0 || precision > 0) {
            fracBinary.append(".");
            // Loop runs for the number of 'precision' steps you requested
            for (int i = 0; i < precision; i++) {
                fractionalPart *= 2;
                int bit = (int) fractionalPart;
                fracBinary.append(bit);
                fractionalPart -= bit;

                if (fractionalPart == 0) break; // Terminate early if the math is clean
            }
        }

        return sign + intBinary + (fracBinary.isEmpty() ? ".0" : fracBinary.toString());
    }

    // Correctly padded 32-bit representation
    static String toLibrary32(float number) {
        int bits = Float.floatToRawIntBits(number);
        return String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0');
    }

    // Correctly padded 64-bit representation
    static String toLibrary64(double number) {
        long bits = Double.doubleToRawLongBits(number);
        return String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0');
    }
}