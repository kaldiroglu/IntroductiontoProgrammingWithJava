package org.javaturk.ipj.ch06.numbers;

public class FloatingPointDemo {

    public static void main(String[] args) {
//        ranges();
//        calculate1();
        calculate2();
    }

    static void ranges() {
        System.out.println("Range of float is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Range of float is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }

    static void calculate1() {
        System.out.println("in calculate1()");

        float fSum6 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("fSum6: " + fSum6);

        float fSum7 = fSum6 + 0.1f;
        System.out.println("fSum7: " + fSum7);

        float fSum8 = fSum7 + 0.1f;
        System.out.println("fSum8: " + fSum8);

        float fSum9 = fSum8 + 0.1f;
        System.out.println("fSum9: " + fSum9);

        float fSum10 = fSum9 + 0.1f;
        System.out.println("fSum10: " + fSum10);

        System.out.println();

        fSum10 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f = " + fSum10);
        System.out.println("Sum of 10 times 0.1 as float:  " + fSum10);

        double dSum20 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("\n0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " + dSum20);
        System.out.println("Sum of 10 times 0.1 as double:  " + dSum20);
    }

    static void calculate2() {
        System.out.println("in calculate2()");

        float floatSum = 0.0f;
        for (
                int i = 0;
                i < 100; i++) {
            floatSum = floatSum + 0.1f;
        }
        System.out.println("Sum of 100 times 0.1 as float:  " + floatSum);

        double doubleSum = 0.0d;
        for (
                int i = 0;
                i < 100; i++) {
            doubleSum = doubleSum + 0.1;
        }
        System.out.println("Sum of 100 times 0.1 as double:  " + doubleSum);
        System.out.println();

        System.out.println("0.1f * 0.1f = " + (0.1f * 0.1f));
        System.out.println("0.3f - 0.2f = " + (0.3f - 0.2f));
        System.out.println("0.1d * 0.1d = " + (0.1d * 0.1d));
        System.out.println("0.3d - 0.2d = " + (0.3d - 0.2d));

        float fPi = 3.14F;
        double dPi = 3.14D;
        System.out.println("\nAre fPi and dPi equals: " + (fPi == dPi));
        System.out.printf("fPi: %30.25f   dPi: %30.25f \n", fPi, dPi);

        float fOne = 1.0F;
        double dOne = 1.0D;
        System.out.println("\nAre 1.0F and 1.0D equals: " + (fOne == dOne));
        System.out.printf("1.0F: %20.18f   1.0D: %20.18f \n", fOne, dOne);

        float fOnePointOne = 1.1F;
        double dOnePointOne = 1.1D;
        System.out.println("\nAre 1.1F and 1.1D equals: " + (fOnePointOne == dOnePointOne));
        System.out.printf("1.1F: %20.18f   1.1D: %20.18f \n", fOnePointOne, dOnePointOne);

        // Min and max of long
        System.out.println("\nRange of long is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        // %.0f formats the double with no decimal places.
        // Math.pow(2, 63) returns 9.223372036854776E18 which loses some precision. It is in fact 9223372036854775808.
        System.out.printf("Range of long is from %.0f to %.0f \n", (-Math.pow(2, 63)), (Math.pow(2, 63) - 1));
    }
}
