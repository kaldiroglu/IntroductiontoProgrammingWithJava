package dev.kaldiroglu.java.ip.hw.ch04.pi;

import java.util.Scanner;

public class MonteCarloPITest {

    public static void main(String[] args) {
        System.out.print("Number of points: ");
        Scanner in = new Scanner(System.in);
        int numberOfPoints = in.nextInt();

        MonteCarloPI monteCarloPI = new MonteCarloPI();
        monteCarloPI.calculatePI(numberOfPoints);
    }
}
