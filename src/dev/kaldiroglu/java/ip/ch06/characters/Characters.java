package dev.kaldiroglu.java.ip.ch06.characters;

public class Characters {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'A';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '9';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = ' ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '₺';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'ğ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0c2c';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u2690';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0041';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);

		// Unicode emojis: https://unicode.org/emoji/charts/full-emoji-list.html
		//ch= '\uD83D\uDE03'; // Too many characters
		System.out.println("\uD83D\uDE03"); // Smiling Face with Open Mouth https://www.compart.com/en/unicode/U+1F603

		// ch = '\uD83D\uDE20'; // Too many characters
		System.out.println("\uD83D\uDE20"); // Angry Face https://www.compart.com/en/unicode/U+1F620

		System.out.println("\uD83D\uDE1D");

		System.out.println();

//		char cc = -1;

		// Negative int to char using a cast operator
		ch = (char) -65471; //A, -65471 + 65536 = 65
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);

		int i = -65471 + 65536;
		System.out.println("i: " + i);

		// Bigger than 65535 int to char
		ch = (char) 65601; // A, 65601 - 65536 = 65
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		i = 65601 - 65536;
		System.out.println("i: " + i);

		ch = (char) 655450; // Z, 655450 - 10 * 65536 = 90
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		i = 655450 - 10 * 65536;
		System.out.println("i: " + i);


	}
}
