package dev.kaldiroglu.java.ip.ch03;

class Comments {
	// This way you can
	// make a block comment

	private String name = "Comments"; // That's just a String.

	/**
	 * This method calculates the double of the passed parameter and returns it.
	 *
	 * @param x The value to be doubled.
	 * @return Double of the value of x passed as a parameter.
	 */
	public int doubleIt(int x) {
		System.out.println("This is name: " + name);

		int i = 3 + // Yes, this works!
				4; // This is a comment at the end of a line.

		System.out.println("i: " + i);
		/*
		 * That's a comment block!
		 */
		return 2 * x; // Just multiply x by 2!
	}

}
