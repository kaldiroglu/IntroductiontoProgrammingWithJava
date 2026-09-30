package org.javaturk.ipj.ch06.numbers;

public class IntegerBinaryConverter {
    public static void main(String[] args) {
        int number = 11;
        printBinary(number);

        number = -11;
        printBinary(number);

        number = 317915;
        printBinary(number);
    }

    static void printBinary(int number){
        System.out.println("\nDecimal: " + number);
        System.out.println("Manual Binary in 32-bit: " + toBinary(number));
        System.out.println("Java Library in 32-bit:  " + Integer.toBinaryString(number));
        System.out.println("Java Library in 64-bit:  " + String.format("%64s", Integer.toBinaryString(number)).replace(' ', '0'));;
    }

    public static String toBinary(int n) {
        // Handle the edge case for zero
        if (n == 0) return "0";

        // If the number is positive, we use the standard division method
        if (n > 0) {
            return positiveToBinary(n);
        } else {
            // For negative numbers, we follow Two's Complement:
            // 1. Get binary of the absolute (positive) value
            // 2. Pad to 32 bits
            // 3. Flip the bits (0->1, 1->0)
            // 4. Add 1
            return twosComplement(n);
        }
    }

    private static String positiveToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n = n / 2;
        }
        return binary.reverse().toString();
    }

    private static String twosComplement(int n) {
        // 1. Get the positive version and pad to 32 bits
        String positive = String.format("%32s", positiveToBinary(Math.abs(n))).replace(' ', '0');

        // 2. Flip the bits (One's Complement)
        char[] bits = positive.toCharArray();
        for (int i = 0; i < bits.length; i++) {
            bits[i] = (bits[i] == '0') ? '1' : '0';
        }

        // 3. Add 1 to the flipped bits
        // We do this manually starting from the right (Least Significant Bit)
        boolean carry = true;
        for (int i = bits.length - 1; i >= 0 && carry; i--) {
            if (bits[i] == '0') {
                bits[i] = '1';
                carry = false; // Carry resolved
            } else {
                bits[i] = '0'; // 1 + 1 = 0 with a carry
            }
        }

        return new String(bits);
    }
}
