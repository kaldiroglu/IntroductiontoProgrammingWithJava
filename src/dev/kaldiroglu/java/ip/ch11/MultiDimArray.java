
package dev.kaldiroglu.java.ip.ch11;

class MultiDimArray {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 9, 0, 3, 8},
				     {4, 1, 6, 7, 5}};
		System.out.println("a's length: " + a.length);
		System.out.println("a[0]'s length: " + a[0].length);
		System.out.println("a[1]'s length: " + a[1].length);

		System.out.println("\nCoordinates");
		int[][] coordinates = {{3, 7},
				               {13, 2},
				               {8, 5}};
		int[] coordinates1 = coordinates[0]; // {3,7}
		int[] coordinates2 = coordinates[1]; // {3,7}
		int[] coordinates3 = coordinates[2]; // {8,5}

		System.out.println("coordinates[0][0]: " + coordinates[0][0]); // 3
		System.out.println("coordinates[0][1]: " + coordinates[0][1]); // 7
		System.out.println("coordinates[1][0]: " + coordinates[1][0]); // 13
		System.out.println("coordinates[1][1]: " + coordinates[1][1]); // 2
		System.out.println("coordinates[2][0]: " + coordinates[2][0]); // 8
		System.out.println("coordinates[2][1]: " + coordinates[2][1]); // 5

		print(coordinates);

		int[] a1 = {2, 7, 8, 3, 9};
		int[] a2 = {5, 0, 8, 6, 1};
		int[] a3 = {3, 7, 4, 3, 9};
		int[][] m = {a1, a2, a3};

		int[][] b = new int[2][];
		b[0] = new int[3];
		b[1] = new int[5];

		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[i].length; j++)
				b[i][j] = (i + 1) * (j + 1) * ((int) (Math.random() * 100));

		print(b);

		// 3-D array with fixed length:
		int[][][] x = new int[2][4][6];
		int[][][] y = new int[323][][];

		// Can't do that!
//		int[][][] z = new int[][][11];

		// Lengths
		System.out.println("\nx.length is " + x.length);
		System.out.println("x[0].length is " + x[0].length);
		System.out.println("x[1].length is " + x[1].length);
		System.out.println("x[0][0].length is " + x[0][0].length);
		System.out.println("x[0][1].length is " + x[0][1].length);
		System.out.println("x[1][0].length is " + x[1][0].length);
		System.out.println("x[1][1].length is " + x[1][1].length);

		// Initialize 3-dim array
		System.out.println("Initialize 3-dim array");
		int counter = 0;
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				for (int k = 0; k < x[i][j].length; k++)
					x[i][j][k] = ++counter;

		print(x);

		// A 3-dim int array of size 4
		int[][][] z = 	{
							{
								{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}
							},
							{
								{16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27, 28, 29, 30}, {31, 32}
							},
							{
								{33, 34, 35, 36}, {33, 38, 39, 40, 41, 42}
							},
							{
								{43}
							}
						};

		System.out.println("\nz.length is " + z.length);
		System.out.println("z[0].length is " + z[0].length);
		System.out.println("z[1].length is " + z[1].length);
		System.out.println("z[0][0].length is " + z[0][0].length);
		System.out.println("z[0][1].length is " + z[0][1].length);
		System.out.println("z[1][0].length is " + z[1][0].length);
		System.out.println("z[1][1].length is " + z[1][1].length);

		System.out.println(z[0][0][0]); // 1
		System.out.println(z[1][2][3]); // 27
		System.out.println(z[2][0][3]); // 36
		System.out.println(z[2][1][5]); // 42
		System.out.println(z[3][0][0]); // 43
	}

	public static void print(int[][] array) {
		System.out.println("\nPrinting the 2-dim array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.println("[" + i + ", " + j + "] : " + array[i][j]);
		}
	}

	public static void print(int[][][] array) {
		System.out.println("\nPrinting the 3-dim array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++)
					System.out.println("[" + i + ", " + j + ", " + k + "] : " + array[i][j][k]);
			}
		}
	}
}
