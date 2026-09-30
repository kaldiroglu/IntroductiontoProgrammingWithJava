package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

import java.util.Scanner;

 class YieldContextualKeyword { //  class yield

    public static void main(String[] args) {
        int yield = 5;   // No problem with using yield as a variable identifier
        System.out.println(yield);

        yield = YieldContextualKeyword.yield("monday");  // Only if yield is qualified!
        System.out.println(yield);

        YieldContextualKeyword ex = new YieldContextualKeyword();
        int length = ex.yield("monday");   // Only if yield is qualified! IntelliJ may now notice the problem until it compiles it!
        System.out.println(length);

        useYields();
    }

    public static void useYields() {
        System.out.println("A number for a day Monday being 1:");
        Scanner stdin = new Scanner(System.in);
        int day = stdin.nextInt();

        System.out.print("Number of letters: ");
        System.out.println(switch (day) {
            case 1: yield YieldContextualKeyword.yield("monday"); // Remove "YieldContextualKeyword" and see its effect! IntelliJ may now notice the problem until it compiles it!
            case 2: yield YieldContextualKeyword.yield("tuesday");
            case 3: yield YieldContextualKeyword.yield("wednesday");
            case 4: yield YieldContextualKeyword.yield("thursday");
            case 5: yield YieldContextualKeyword.yield("friday");
            case 6: yield YieldContextualKeyword.yield("saturday");
            case 7: yield YieldContextualKeyword.yield("sunday");
            default: {int yield = -1; yield yield;}
        });
    }

    static int yield(String day){
        return day.length();
    }

//    int yield(String day){
//        return day.length();
//    }
}
