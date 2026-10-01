package dev.kaldiroglu.java.ip.ch10.loop;

class ForDemo {

    public static void main(String[] args) {
//        simpleFor();
//        multiplicationTable();
		  others();
    }

    static void simpleFor() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
//            System.out.println(i + " " + sum);
        }
        System.out.println("Sum: " + sum);

        sum = 0;
        int i = 1;
        for (; i <= 100;) {
            sum += i;
//            System.out.println(i + " " + sum);
            i++;
        }
        System.out.println("Sum: " + sum);
    }


    static void multiplicationTable() {
        System.out.println("\nMultiplication Table");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    static void others() {
        System.out.println("\nA Little Bit Complicated For Loop");

        for (int i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }

        int i;
        int j;
        for (i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }

        int ii;
        long jj;
        for (ii = 1, jj = ii + 10; (ii < 5 & jj > 2); ii++, jj = ii * 2) {
            System.out.println("ii= " + ii + " jj= " + jj);
        }

//		That's error!
//		for (int i = 1, long j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
//			System.out.println("i= " + i + " j= " + j);
//		}

        int t = 7;
        for (; t < 8; t += 2)
            System.out.println(t + ">>>>");

        System.out.println(t);

        System.out.println();

        // Does not go into for loop
        for (int k = 8; k < 8; k++) {
            System.out.println(">>>>> k: " + k);
        }

        // Dangerous! Infinite loop!
//        for(;;)
//            System.out.println("***********");
    }
}
