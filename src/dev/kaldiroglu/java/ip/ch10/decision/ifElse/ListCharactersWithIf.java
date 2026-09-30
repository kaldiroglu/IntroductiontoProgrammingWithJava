package dev.kaldiroglu.java.ip.ch10.decision.ifElse;

class ListCharactersWithIf {

	public static void main(String[] args) {
		for (char c = 0; c < 65535; c++) { // What happens if you change it to c <= 65535
			System.out.print("\t" + (int) c + " : " + c);
			if (c % 10 == 0 && c != 0 && c != 10)
				System.out.print("\n");
		}
	}
}