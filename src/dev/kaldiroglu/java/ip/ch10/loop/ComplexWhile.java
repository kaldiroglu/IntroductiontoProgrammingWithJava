package dev.kaldiroglu.java.ip.ch10.loop;

class ComplexWhile {

	public static void main(String[] args) {
		System.out.println("First while");
		
		int i = (int) (10 * Math.random());
		int j = (int) (10 * Math.random());
		boolean b = i > j;
		while (b = !b)
			System.out.println("i: " + i + " j: " + j);

		System.out.println("\nSecond while");

		while (b = i > j ? true : false) {
			System.out.println("i: " + i + " j: " + j);
			i = (int) (10 * Math.random());
			j = (int) (10 * Math.random());
		}

		while (i > j) {
			System.out.println("i: " + i + " j: " + j);
			i = (int) (10 * Math.random());
			j = (int) (10 * Math.random());
		}

		System.out.println("\nThird while");
		
		while (b = getBoolean()) {
			System.out.println("i: " + i + " j: " + j);
			i = (int) (10 * Math.random());
			j = (int) (10 * Math.random());
		}
	}
	
	public static boolean getBoolean() {
		return Math.random() > 0.5 ? true : false;
	}
}
