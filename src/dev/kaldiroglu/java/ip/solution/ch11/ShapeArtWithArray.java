package dev.kaldiroglu.java.ip.solution.ch11;

import java.util.Arrays;

public class ShapeArtWithArray {
    public static void main(String[] args) {
        drawRectancleAsMatrix(10, 15);
        drawRectancleAsMatrixWithEol(10, 15);
        drawRightAngleTriangleWithMatrix(4);
        drawIsoscelesTriangleWithMatrix(5);
    }

    /**
     * Draws a rectangle with given height and width. It uses for loops to find
     * places for stars. The method stores stars and blanks in a matrix so that
     * after completing the matrix the method prints it.
     *
     * @author akin
     *
     * @param height
     *            Height of the rectangle.
     * @param width
     *            Width of the rectangle.
     */
    public static void drawRectancleAsMatrix(int height, int width) {
        String matrix[][] = new String[height][width];

        for (int i = 0; i < height; i++) {
            if (i == 0 | i == height - 1) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = "*";
                }
            } else {
                for (int j = 0; j < width; j++) {
                    if (j == 0 | j == width - 1)
                        matrix[i][j] = "*";
                    else
                        matrix[i][j] = " ";
                }
            }
        }

        printMatrix(matrix);
    }

    /**
     * Draws a rectangle with given height and width. It uses for loops to find
     * places for stars. The method stores stars and blanks in a matrix so that
     * after completing the matrix the method prints it. The matrix also includes
     * end of lines.
     *
     * @author akin
     *
     * @param height
     *            Height of the rectangle.
     * @param width
     *            Width of the rectangle.
     */
    public static void drawRectancleAsMatrixWithEol(int height, int width) {
        width = width + 1;
        String matrix[][] = new String[height][width];

        for (int i = 0; i < height; i++) {
            if (i == 0 | i == height - 1) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = "*";
                    if (j == width - 1)
                        matrix[i][j] = "\n";
                }
            } else {
                for (int j = 0; j < width; j++) {
                    if (j == 0 | j == width - 2)
                        matrix[i][j] = "*";
                    else if (j == width - 1)
                        matrix[i][j] = "\n";
                    else
                        matrix[i][j] = " ";
                }
            }
        }

        printMatrixWithEol(matrix);
    }

    public static void drawRightAngleTriangleWithMatrix(int height) {
        char[][] matrix = new char[height][2 * height + 1];

        for (int i = 0; i < height; i++) {
            Arrays.fill(matrix[i], ' ');
            for (int j = 0; j < 2 * i + 1; j++)
                matrix[i][j] = '*';
        }

        printMatrix(matrix);
    }

    public static void drawIsoscelesTriangleWithMatrix(int height) {
        int base = 2 * height - 1;
        char[][] matrix = new char[height][base];
        int starCount = 0;
        int spaceCount = 0;
        int index = 0; // index of the cell of the matrix[height]
        for (int i = 0; i < height; i++) {
            starCount = 2 * i + 1;
            spaceCount = base - starCount;
            int j = 0;
            for (; j < (spaceCount / 2); j++) {
                matrix[i][j] = ' ';
            }
            index = j;
            for (; j < (index + starCount); j++) {
                matrix[i][j] = '*';
            }
            index = j;
            for (; j < index + (spaceCount / 2); j++)
                matrix[i][j] = ' ';

            index = 0;
        }
        printMatrix(matrix);
    }

    /**
     * Prints out the given String matrix that does not include end of lines.
     * @author akin
     * @param matrix Matrix to be printed.
     */
    public static void printMatrix(String[][] matrix) {
        int height = matrix.length;
        for (int i = 0; i < height; i++) {
            int width = matrix[i].length;
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Prints out the given char matrix that does not include end of lines.
     * @author akin
     * @param matrix Matrix to be printed.
     */
    public static void printMatrix(char[][] matrix) {
        int height = matrix.length;
        for (int i = 0; i < height; i++) {
            int width = matrix[i].length;
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Prints out the given matrix that includes end of lines.
     * @author akin
     * @param matrix Matrix to be printed.
     */
    public static void printMatrixWithEol(String[][] matrix) {
        int height = matrix.length;
        for (int i = 0; i < height; i++) {
            int width = matrix[i].length;
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
}

