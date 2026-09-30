package dev.kaldiroglu.java.ip.solution.ch10;

/**
 * https://en.wikipedia.org/wiki/Greatest_common_divisor (Euclid's algorithm)
 * https://tr.wikipedia.org/wiki/Ortak_b%C3%B6len
 */
public class GCD {

    public static void main(String[] args) {
        findGcd(20, 8);
        findGcd(54, 24);
//		findGcd(60, 32);
//		findGcd(4972, 814);

        findGcdRecursively(20, 8);
        findGcdRecursively(60, 32);
        findGcdRecursively(4972, 814);
    }

    public static void findGcd(int a, int b) {
        int gcd = 0;
        int tmpA = a;
        int tmpB = b;
        while (b > 0) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        gcd = a;

        System.out.println("GCD of " + tmpA + " and " + tmpB + " : " + gcd);
    }

    public static void findGcdRecursively(int a, int b) {
        int gcd = 0;
        boolean found = false;

        if (b == 0) {
            gcd = a;
            found = true;
        } else
            findGcdRecursively(b, a % b);

        if (found)
            System.out.println("GCD of " + a + " and " + b + " : " + gcd);
    }
}

