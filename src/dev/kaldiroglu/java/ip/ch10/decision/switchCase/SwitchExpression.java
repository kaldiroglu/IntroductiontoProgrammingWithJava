package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

import java.util.Scanner;

class SwitchExpression {

    public static void main(String[] args) {
//        switchWithArrow1();
//		  switchWithArrow2();
//        switchWithArrow3();

        switchWithYield1();
//        switchWithYield2();
//        switchWithYield3();
    }

    /**
     * Expression form of switch-case that came in Java 12. It returns a value and doesn't require break to avoid fallthrough.
     */
    public static void switchWithArrow1() {
        System.out.println("A number for a month :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

        String monthInString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error! Please enter the month number between 1 and 12";
        };

        System.out.println(monthInString);
    }

    /**
     * More than one constant can be used in a case.
     */
    public static void switchWithArrow2() {
        System.out.println("A number for a month :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            //case 6, 7, 8 -> throw new RuntimeException();
            case 9, 10, 11 -> "Fall";
            default -> "Error! Please enter the month number between 1 and 12";
        };
        System.out.println("Season is " + season);
    }

    /**
     * More than one constant can be used in a case.
     */
    public static void switchWithArrow3() {
        System.out.println("A number for a day Monday being 1:");
        Scanner stdin = new Scanner(System.in);
        int day = stdin.nextInt();

        System.out.print("Number of letters: ");
        System.out.println("Number of letters: " + switch (day) {
            case 1, 5, 7 -> 6;
            case 2 -> "1";
            case 4, 6 -> 8;
            case 3 -> 9;
            //default -> throw new Exception();
            default -> -1;
        });

        // That's problem!
//        int ii = 6;
        var outcome = switch (day) {
            case 1, 5, 7 -> 6;
            case 2 -> "7";
            case 4, 6 -> 8;
            case 3 -> 9;
            //default -> throw new Exception();
            default -> -1;
        };
        System.out.println(outcome);
    }

    /**
     * Expression form of switch-case that came in Java 12. It returns a value and doesn't require break to avoid fallthrough.
     */
    public static void switchWithYield1() {
        System.out.println("A number for a month :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

        String monthInString = switch (month) {
            case 1:
                yield "January";
            case 2:
                yield "February";
            case 3:
                yield "March";
            case 4:
                yield "April";
            case 5:
                yield "May";
            case 6:
                yield "June";
            case 7:
                yield "July";
            case 8:
                yield "August";
            case 9:
                yield "September";
            case 10:
                yield "October";
            case 11:
                yield "November";
            case 12:
                yield "December";
            default:
                yield "Error! Please enter the month number between 1 and 12";
        };
        System.out.println(monthInString);
    }

    public static void switchWithYield2() {
        System.out.println("A number for a month :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

        String monthInString = switch (month) {
            case 1 -> {
                String s = "January";
                yield s;
            }
            case 2 -> "February";
//            {
//                yield "February";
//            }
            case 3 -> {
                yield "March";
            }
            case 4 -> {
                yield "April";
            }
            case 5 -> {
                yield "May";
            }
            case 6 -> {
                yield "June";
            }
            case 7 -> {
                yield "July";
            }
            case 8 -> {
                yield "August";
            }
            case 9 -> {
                yield "September";
            }
            case 10 -> {
                yield "October";
            }
            case 11 -> {
                yield "November";
            }
            case 12 -> {
                yield "December";
            }
            default -> {
                yield "Error! Please enter the month number between 1 and 12";
            }
        };
        System.out.println(monthInString);
    }

    public static void switchWithYield3() {
        System.out.println("A number for a month :");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();

        String monthInString = switch (month) {
            case 1 -> {
                String monthString = "January";
                System.out.println(monthString);
                yield monthString;
            }
            case 2 -> {
                String monthString = "February";
                System.out.println(monthString);
                yield monthString;
            }
            case 3 -> {
                String monthString = "March";
                System.out.println(monthString);
                yield monthString;
            }
            case 4 -> {
                String monthString = "April";
                System.out.println(monthString);
                yield monthString;
            }
            case 5 -> {
                String monthString = "May";
                System.out.println(monthString);
                yield monthString;
            }
            case 6 -> {
                String monthString = "June";
                System.out.println(monthString);
                yield monthString;
            }
            case 7 -> {
                String monthString = "July";
                System.out.println(monthString);
                yield monthString;
            }
            case 8 -> {
                String monthString = "August";
                System.out.println(monthString);
                yield monthString;
            }
            case 9 -> {
                String monthString = "September";
                System.out.println(monthString);
                yield monthString;
            }
            case 10 -> {
                String monthString = "October";
                System.out.println(monthString);
                yield monthString;
            }
            case 11 -> {
                String monthString = "November";
                System.out.println(monthString);
                yield monthString;
            }
            case 12 -> {
                yield returnAMonth();
            }
            default -> {
                yield "Error! Please enter the month number between 1 and 12";
            }
        };
        System.out.println(monthInString);
    }

    static String returnAMonth() {
        String monthString = "December";
        System.out.println(monthString);
        return monthString;
    }
}
