package dev.kaldiroglu.java.ip.ch10.loop;

class HaltingProblem2 {

    public static void main(String[] args) {
        for(double d = 0.0; d != 1.0; d = d + 0.1)
            System.out.println(d);
    }
}
