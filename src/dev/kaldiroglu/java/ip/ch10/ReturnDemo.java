package dev.kaldiroglu.java.ip.ch10;

class ReturnDemo {

    public static void main(String[] args) {
        System.out.println(max1(10, 5));
        System.out.println(max1(5, 10));
        System.out.println(max1(5, 5));
        System.out.println(max2(10, 5));
        System.out.println(max2(5, 10));
        System.out.println(max2(5, 5));
    }

    static int max1(int value1, int value2) {
        if (value1 > value2)
            return +1;
        else if (value1 < value2)
            return -1;
        else
            return 0; // Match

        // Comment out following line
//        System.out.println("Metot sonu!");
    }

    static int max2(int value1, int value2) {
        if (value1 > value2)
            return +1;
        if (value1 < value2)
            return -1;

        return 0; // Match

        // Comment out following line
        //System.out.println("Metot sonu!");
    }

    /*
    Having only one return in a method might be better for readability.
     */
    static int max3(int value1, int value2) {
        int result = 0;
        if (value1 > value2)
            result = +1;
        else if (value1 < value2)
            result = -1;

        return result;

        // Comment out following line
        //System.out.println("Metot sonu!");
    }

    public void method0() {
        System.out.println("A void method!");
        return;
    }

    public void method1() {

    }

    public void method2() {
        return;
//		System.out.println("");
    }

    /**
     * This method always returns null!
     * @return null
     */
    public String method3() {
        //return new String("Java");
//		return "Java";
        return null;
    }

    public int method4() {
        return 5;
//        return null; // Problem!
    }
}
