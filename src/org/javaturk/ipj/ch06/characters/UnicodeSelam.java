package org.javaturk.ipj.ch06.characters;

public class UnicodeSelam {

	public static void main(String[] args) {
		String selamInJapanese = "\u3053\u3093\u306b\u3061\u306f\u4e16\u754c";
		System.out.println("Japonca da Selam Dünya: \t" + selamInJapanese);
		// Notice \n
		System.out.print("Ya da\n");

		char ch1 = '\u3053';
		char ch2 = '\u3093';
		char ch3 = '\u306b';
		char ch4 = '\u3061';
		char ch5 = '\u306f';
		char ch6 = '\u4e16';
		char ch7 = '\u754c';

		System.out.println("Japonca da Selam Dünya: \t" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);

		String selamInArabic = "\u0633\u0644\u0627\u0645";
		System.out.println("Arapça Selam: \t\t\t" + selamInArabic); // Notice \t
		
		String selamInHebrew = "\u05e9\u05dc\u05d5\u05dd";
		System.out.println("Ibranice Selam: \t\t" + selamInHebrew);
	}
}
