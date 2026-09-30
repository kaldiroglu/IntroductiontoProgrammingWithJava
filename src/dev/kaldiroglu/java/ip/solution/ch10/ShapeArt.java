package dev.kaldiroglu.java.ip.solution.ch10;

/**
 * Ypu can see better shapes if use "* " and "  " instead of "*" and " ".
 */
public class ShapeArt {

    void main() {
//        drawSolidRectangle(10, 10);
//        drawHollowRectangle(10, 15);
//        drawRightAngleTriangle(10);
//        drawIsoscelesTriangle1(10);
//        drawIsoscelesTriangle2(10);
        drawCircle(5);
    }

    /**
     * Draws a rectangle with the given height and width. It uses for loops to find
     * places for stars.
     *
     * @param height Height of the rectangle.
     * @param width  Width of the rectangle.
     * @author akin
     */
    public static void drawHollowRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawSolidRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * Draws a right angle triangle with the given height. It uses for loops to find
     * places for stars.
     *
     * @param height Height of the triangle.
     * @author akin
     */
    public static void drawRightAngleTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * Draws a isosceles angle triangle with given height. It uses for loops to
     * find places for stars.
     *
     * @param height Height of the triangle.
     * @author akin
     */
    public static void drawIsoscelesTriangle1(int height) {
        int base = 2 * height - 1;
        int starCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < height; i++) {
            starCount = 2 * i + 1;
            spaceCount = base - starCount;
            for (int j = 0; j < base; j++) {
                if (j < (spaceCount / 2) | j >= (spaceCount / 2) + starCount)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
    }

    /**
     * Draws an isosceles angle triangle with the given height. It uses for loops to
     * find places for stars.
     *
     * @param height Height of the triangle.
     * @author akin
     */
    public static void drawIsoscelesTriangle2(int height) {
        int base = 2 * height - 1;
        int starCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < height; i++) {
            starCount = 2 * i + 1;
            spaceCount = base - starCount;
            for (int j = 0; j < spaceCount / 2; j++)
                System.out.print(" ");
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            for (int j = 0; j < spaceCount / 2; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    public static void drawCircle(int radius) {
        int width = 2 * radius;
        int height = width;
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                int distance = (int) Math.sqrt(Math.pow((i - radius), 2) + Math.pow((j - radius), 2));
                if (distance <= radius + 0.5 && distance >= radius - 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
