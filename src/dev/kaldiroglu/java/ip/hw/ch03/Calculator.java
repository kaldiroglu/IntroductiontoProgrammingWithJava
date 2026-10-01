package dev.kaldiroglu.java.ip.hw.ch03;

/**
 * That's a tax calculator
 */
public class Calculator {
    private final double rate = 0.08;

    public double calculateTax(double amount) {
        return amount * rate;
    }
}
