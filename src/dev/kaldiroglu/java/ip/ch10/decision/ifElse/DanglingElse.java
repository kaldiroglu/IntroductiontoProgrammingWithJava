package dev.kaldiroglu.java.ip.ch10.decision.ifElse;

class DanglingElse {

    public static void main(String[] args) {
        int i = (int) (100 * Math.random());
        int j = (int) (100 * Math.random());

        if (i > j)
            if (i - j > 10) System.out.println("i is at least 10 greater than j.");
            else System.out.println("i is greater than j.");
        else System.out.println("i is not greater than j.");

        System.out.println("i:  " + i + "  j:  " + j);
    }
}
