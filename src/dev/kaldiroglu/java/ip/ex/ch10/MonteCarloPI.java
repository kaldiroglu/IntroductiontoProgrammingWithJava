package dev.kaldiroglu.java.ip.ex.ch10;

import java.util.Scanner;

public class MonteCarloPI {
    public static void main(String[] args) {
        System.out.println("Atılacak nokta sayısını girin:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;

        for(int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = x * x + y * y;
            if(distance <= 1)
                r++;
        }

        double pi = 4 * r / (double) n;
        System.out.println("Yakınsanan pi: " + pi);
        System.out.println("Gerçek pi: " + Math.PI);
    }
}
