package dev.kaldiroglu.java.ip.ch10.loop;

class DoWhileDemo {
    public static void main(String[] args) {
    	
        double r = 0;
        int count = 0;
        do {	// First comes block
            r = Math.random();
            System.out.println("in do-while: " + r);
            count++;
        }while(r < 0.8);	// Then condition

        System.out.println("After while, count: " + count);
    }
}
