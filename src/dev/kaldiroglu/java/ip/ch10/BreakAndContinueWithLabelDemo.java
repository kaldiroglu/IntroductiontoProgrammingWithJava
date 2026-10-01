package dev.kaldiroglu.java.ip.ch10;

class BreakAndContinueWithLabelDemo {

    public static void main(String[] args) {
        int[][] array = { {32, 87, 3, 589, 7, 912, 617},
                          {12, 1076, 2000, 12, 3},
                          {622, 127, 12, 12}};

		int searchFor = 12;

        boolean foundIt = false;

        here:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchFor) {
                    foundIt = true;
                    System.out.println("Found " + searchFor + " at " + i + ", " + j);
                    continue here; // break == continue here
                }
            }
        }

        if (!foundIt)
            System.out.println(searchFor + " not in the array");
    }
}
