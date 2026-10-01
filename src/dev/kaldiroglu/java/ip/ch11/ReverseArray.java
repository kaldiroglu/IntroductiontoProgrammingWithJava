package dev.kaldiroglu.java.ip.ch11;

class ReverseArray {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverseA = reverse(a);

        System.out.println("reverse array");
        for (int i : reverseA)
            System.out.println(i);
    }

    static int[] reverse(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];
        int cursor = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverseArray[cursor] = array[i];
            cursor++;
            //reverseArray[length -1 - i] = array[i];
        }
        return reverseArray;
    }
}
