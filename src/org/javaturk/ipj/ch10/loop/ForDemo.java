package org.javaturk.ipj.ch10.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 * </p>
 * This is an example about unary operators.
 */
public class ForDemo {

    public static void main(String[] args) {
//        simpleFor1();
//        multiplicationTable();
//        fibonacciNumbers(100);
		others();
    }

    static void simpleFor1() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(i + " " + sum);
        }
        System.out.println("Sum: " + sum);
    }

    static void simpleFor2() {
        int sum = 0;
        int i = 0;
        for (; i <= 100; i++) {
            sum += i;
            System.out.println(i + " " + sum);
        }
        System.out.println("i: " + i);
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

    static void fibonacciNumbers(long count) {
        System.out.println("\nFibonacci Numbers");

        long f0 = 1;
        long f1 = 1;
        long fibonacciNumber;

        System.out.format("%20d", f0);
        System.out.format("%20d", f1);
        for (int i = 3; i <= count; i++) {
            fibonacciNumber = f0 + f1;
            System.out.format("%20d", fibonacciNumber);
            f0 = f1;
            f1 = fibonacciNumber;
            if (i % 10 == 0)
                System.out.println();
        }
    }

    static void others() {
        System.out.println("\nA Little Bit Complicated For Loop");

        for (int i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }

//        int i;
//        int j;
//        for (i = 1, j = i + 10; (i < 5 & j > 2); i++, j = i * 2) {
//            System.out.println("i= " + i + " j= " + j);
//        }

        int ii;
        long jj;
        for (ii = 1, jj = ii + 10; (ii < 5 & jj > 2); ii++, jj = ii * 2) {
            System.out.println("ii= " + ii + " jj= " + jj);
        }

//		That's error! Two counter types are defined.
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

        // Dangerous!
//        for(;;)
//            System.out.println("***********");

        // Following for is ok but causes dead code.
//		int i = 0;
//		for (;;) {
//			System.out.println(i);
//			if (true)
//				break;
//			i++; // This is dead code.
//		}

//		double r = Math.random();
//        System.out.println("r: " + r);
//        for (;;) {
//        	double r = Math.random();
//        	if(r < 0.8d)
//        		break;
//        	System.out.println(r);
//        }
    }
}
