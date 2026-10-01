package dev.kaldiroglu.java.ip.ch10.loop;

class WhileDemo {
    public static void main(String[] args) {
        double r = Math.random();
        System.out.println("r: " + r);

        int count = 0;
        while(r < 0.8) {
            r = Math.random();
            System.out.println("in while: " + r);
            count++;
        }

        System.out.println("After while, count: " + count);
    }
}
