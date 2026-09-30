package dev.kaldiroglu.java.ip.solution.ch10;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Solution of a quadratic equation: ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();
        if( a == 0) {
            System.out.println("This equation has no solution!");
            return;
        }
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        double root1, root2;
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            System.out.println("There are two real and distinct roots:");
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (discriminant == 0) {
            System.out.println("There are two real and equal roots:");
            root1 = root2 = -b / (2.0 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {
            System.out.println("The roots are complex number and distinct");
            double real = -b / (2.0 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
