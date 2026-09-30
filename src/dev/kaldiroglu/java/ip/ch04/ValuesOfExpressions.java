package dev.kaldiroglu.java.ip.ch04;


public class ValuesOfExpressions {

    public static void main(String[] args) {
        int i = 5; // Constant expression
        boolean b = i > 0; // Constant expression
        int j = i + 1; // Constant expression
        String s = "I love" + " " + " Java"; // Constant expression

        int k = increaseOne(i); // Not a constant expression
        System.out.println(k);

        double d = Math.random(); // Not a constant expression
        System.out.println(d);
    }

    public static int increaseOne(int k) {
        return k + 1;
    }
}
