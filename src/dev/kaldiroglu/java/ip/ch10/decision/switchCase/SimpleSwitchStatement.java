package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

public class SimpleSwitchStatement {
    public static void main(String[] args) {
        int i = 2;
//        long i = 1; // Problem!
        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:System.out.println("i is 3");
                break;
            default: System.out.println("i is not 1, 2 or 3");
        }
    }
}
