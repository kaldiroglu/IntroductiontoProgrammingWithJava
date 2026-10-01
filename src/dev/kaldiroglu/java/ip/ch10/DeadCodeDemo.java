package dev.kaldiroglu.java.ip.ch10;

class DeadCodeDemo {

	// A constant variable. This is the whole reason if-statements are exempt
	// from the unreachability rule: flipping this to true must not require
	// any other change to the code.
	static final boolean DEBUG = false;

	public static void main(String[] args) {
		sameConditionTwoOutcomes();
		deadAfterBreak();
		deadStore();
		debugFlag();
		neverEntered();
		// neverCalled() is never called from anywhere: the whole method is dead.
	}

	/**
	 * The same constant condition, two different verdicts from the compiler.
	 */
	static void sameConditionTwoOutcomes() {
		System.out.println("\n--- if(false) vs while(false) ---");

		if (false) {
			// Dead code. Never runs, but this COMPILES.
			System.out.println("if(false)");
		}

		// while (false) {
		// System.out.println("while(false)"); // error: unreachable statement
		// }

		System.out.println("Only the while version is rejected by javac.");
	}

	/**
	 * Moved here from ForDemo.others(), where it sat commented out with the note
	 * "Following for is ok but causes dead code." It belongs with the rest of the
	 * dead-code material rather than in a slide about for loops.
	 */
	static void deadAfterBreak() {
		System.out.println("\n--- dead code after a conditional break ---");

		int i = 0;
		for (;;) {
			System.out.println("i = " + i);
			if (true)
				break;
			i++; // Dead code: reachable for the compiler, never executed at run time.
		}

		// for (;;) {
		// break;
		// System.out.println("after break"); // error: unreachable statement
		// }

		System.out.println("i is still " + i + ": the i++ never ran.");
	}

	/**
	 * A dead store: a value computed and then overwritten before anyone reads it.
	 */
	static void deadStore() {
		System.out.println("\n--- dead store ---");

		int total = 100; // Dead: overwritten below without ever being read.
		total = 20 + 30;

		System.out.println("total = " + total); // 50, never 100
	}

	/**
	 * Conditional compilation. The body is dead while DEBUG is false, and comes
	 * alive the moment it is set to true -- with no other edit.
	 */
	static void debugFlag() {
		System.out.println("\n--- DEBUG flag ---");

		if (DEBUG) {
			System.out.println("Trace: entering debugFlag()");
		}

		System.out.println("Set DEBUG to true and this method starts tracing.");
	}

	/**
	 * Dead at run time, not at compile time: the condition is not a constant, so
	 * the compiler cannot know the body never runs.
	 */
	static void neverEntered() {
		System.out.println("\n--- loop that never runs ---");

		for (int k = 8; k < 8; k++) {
			System.out.println("k = " + k); // Never printed, but perfectly legal.
		}

		System.out.println("The for body never executed.");
	}

	/**
	 * Nothing calls this method. The entire body is dead code, and javac does not
	 * mind at all.
	 */
	static void neverCalled() {
		System.out.println("This line can never print.");
	}
}
