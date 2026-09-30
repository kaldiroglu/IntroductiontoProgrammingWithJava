package org.javaturk.ipj.ch06.conversion;

public class PowerDemo {

    public static void main(String[] args) {
        double d = Math.pow(2, 10);
        System.out.println(d);

//        int i = Math.pow(2, 10); // Cast needed
        int i = (int) Math.pow(2, 10);
        System.out.println(i);

        i = (int) Math.pow(2, 31);
        System.out.println(i);

        d = Math.pow(2, 31);
        System.out.println(d);

        long l = (long) Math.pow(2, 31);
        System.out.println(l);
    }
}
