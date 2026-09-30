package dev.kaldiroglu.java.ip.solution.ch10;

public class SwitchScope {
    void main() {
        int x = 2;

        switch(x) {
            case 1:
                int y = 10;
                System.out.println(y);
                break;
            case 2:
                y = 20;
                System.out.println(y);
                break;
            case 3:
                //int y = 30; // Error!
                y = 30;
                System.out.println(x);
                break;
        }
    }
}
