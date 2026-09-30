package dev.kaldiroglu.java.ip.solution.ch10;

/**
 * https://en.wikipedia.org/wiki/Leibniz_formula_for_%CF%80
 */
public class LeibnizPI {
    void main() {
        int n = 10_000_000; // Number of the terms we want to calculate
        double sum = 0; // Sum, which gets closer to PI/4
        double term = 1.0; // First term
        sum += term;
        boolean alternate = true;

        for (int i = 3; i <= n; i += 2) {
            term = 1.0 / i;
            if(alternate) {
                sum -= term;
                alternate = false;
            }
            else{
                sum += term;
                alternate = true;
            }
        }
        System.out.printf("Calculated PI = %20.10f\n", sum * 4);
        System.out.printf("Expected PI =   %20.10f", Math.PI);
    }
}
