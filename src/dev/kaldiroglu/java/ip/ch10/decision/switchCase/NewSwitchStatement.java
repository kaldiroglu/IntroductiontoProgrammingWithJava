package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

import java.util.Scanner;

class NewSwitchStatement {

    public static void main(String[] args) {
//        switchCaseWithBreakStatement();
//        switchCaseWithArrowStatement1();
        switchCaseWithArrowStatement2();
    }

    /**
     * Original form of switch-case since Java 1.0. It requires break to avoid fallthrough.
     */
    public static void switchCaseWithBreakStatement(){
        System.out.println("in switchCaseWithBreakStatement()");
        System.out.println("Enter a number for month:");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();
        switch (month) {
            case 1: {
                System.out.println("January");
                break;
            }
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
//                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error! Please enter the month number between 1 and 12");
                break;
        }
        System.out.println("Enf of switch-case.");
    }

    /**
     * Improved form of switch-case statement that came in Java 12. It doesn't require break to avoid fallthrough.
     */
    public static void switchCaseWithArrowStatement1(){
        System.out.println("in switchCaseWithArrowStatement1()");
        System.out.println("Enter a number for month:");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();
        switch (month) {
            case 1 ->{
                System.out.println("January");
            }
            case 2 ->
                System.out.println("February");
//                System.out.println("February"); // Problem!
            case 3 ->
                System.out.println("March");
            case 4 ->
                System.out.println("April");
            case 5 ->
                System.out.println("May");
            case 6 ->
                System.out.println("June");
            case 7 ->
                System.out.println("July");
            case 8 ->
                System.out.println("August");
            case 9 ->
                System.out.println("September");
            case 10 ->
                System.out.println("October");
            case 11 ->
                System.out.println("November");
            case 12 ->
                System.out.println("December");
            default ->
                System.out.println("Error! Please enter the month number between 1 and 12");
        }
        System.out.println("Enf of switch-case.");
    }

    /**
     * Valid after Java 14
     */
    public static void switchCaseWithArrowStatement2() {
        System.out.println("in switchCaseWithArrowStatement2()");
        System.out.println("Enter a number for month:");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Fall");
            default -> System.out.println("Error! Please enter the month number between 1 and 12");
        }
    }
}
