package org.javaturk.ipj.ch06.numbers;

public class PiDemo {

    public static void main(String[] args) {
        double doublePi = 3.141592653589793238462643383279502884197; // Pi with 39 decimal digits
        System.out.println("\ndoublePi: " + doublePi);
        System.out.printf("doublePi: %2.40f\n\n", doublePi);

        float floatPi = 3.141592653589793238462643383279502884197F; // Pi with 39 decimal digits
        System.out.println("floatPi: " + floatPi);
        System.out.printf("floatPi: %2.40f\n\n", floatPi);

        doublePi = 22.0/7; // 22/7 is close to real pi
        System.out.println("doublePi: " + doublePi);
        System.out.printf("doublePi: %2.40f\n", doublePi);
    }
}
