package dev.kaldiroglu.java.ip.ch10.loop;

class ForAndWhile {

    public static void main(String[] args) {
        double r = Math.random();
        System.out.println("r: " + r);

        System.out.println("while");
        while (r < 0.8d) {
            r = Math.random();
            System.out.println(r);
        }

        r = Math.random();
        System.out.println("for");
        for (int i = 0; i >= 0; i++) {
            r = Math.random();
            System.out.println(r);
            if (r >= 0.8d)
                i = -2;
        }

        r = Math.random();
        System.out.println("for without i++");
        for (int i = 0; i >= 0; ) { // Remove i++
            r = Math.random();
            System.out.println(r);
            if (r >= 0.8d)
                i = -1;
        }
    }
}
