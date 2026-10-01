package dev.kaldiroglu.java.ip.ch10;

class BreakAndContinueDemo {
	public static void main(String args[]) {
		
		System.out.println("break\n");
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0)
				break ; // Terminate loop.
			System.out.println(i + ":   " + Math.sqrt(i));
		}
		
		System.out.println("\ncontinue\n");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0)
				continue; // Terminate only this step.
			System.out.println(i + ":   " + Math.sqrt(i));
		} // end of for loop
	} 
}
