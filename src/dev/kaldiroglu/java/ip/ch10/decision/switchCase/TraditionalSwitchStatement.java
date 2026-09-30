package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

import java.util.Scanner;

public class TraditionalSwitchStatement {

    public static void main(String[] args) {
        System.out.println("A number :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

//        switchDemo1(month);
//        switchDemo2(month);
        switchDemo3(month);

    }

    public static void switchDemo1(int month) {//throws Exception {
//            final int i = 5;
//        final int i = (2 - 1 ) * 5;
//		 final int  i = returnConstant(); // That doesn't work because it is not a constant expression
//            final int i = 4 * 5 - (3 * 6 + 1);

        switch (month) {
            case 1:
                System.out.println("The first month:");
                System.out.println("January");
                break;
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
                break;
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
            case 12: {
                System.out.println("The last month:");
                System.out.println("December");
                break;
            }
            default:
                //throw new Exception("");
                System.out.println("Error! Please enter the month number between 1 and 12");
                break;
        }
        System.out.println("After switch-case.");
    }

    /**
     * Omitting a break sometimes works well!
     * @param month
     */
    public static void switchDemo2(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Error! Please enter the month number between 1 and 12");
                break;
        }
    }

    /**
     * Valid after Java 14
     * @param month
     */
    public static void switchDemo3(int month) {
        switch (month) {
//            default:
//                System.out.println("Error! Please enter the month number between 1 and 12");
//                break;
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Error! Please enter the month number between 1 and 12");
//                break;
        }
    }

    public static void switchDemo4(){
        // That's ok!
        switch(1){

        }

        // That's not ok!
//        switch(null){
//
//        }
    }

//    static void f() {
//        f();
//    }

    private static int returnConstant() {
        return 5;
    }
}

