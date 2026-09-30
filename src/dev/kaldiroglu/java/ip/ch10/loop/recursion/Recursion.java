package dev.kaldiroglu.java.ip.ch10.loop.recursion;

class Recursion {

    static int counter = 0;

    public static void main(String[] args) {
        f();
    }

    static void f(){ // Recursive method
        counter++;
        System.out.println(counter);
        f();
    }
}
