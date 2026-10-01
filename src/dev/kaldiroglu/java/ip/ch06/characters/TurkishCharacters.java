package dev.kaldiroglu.java.ip.ch06.characters;

public class TurkishCharacters {
	public static void main(String[] args) {
		int ı = 8;
		int ğ = 3;
		
		double ş = şunuHesaplaBakalım(ı, ğ);
		System.out.println("Toplam fiyat şu kadardır: " + ş + '\u20BA');
	}

	public static double şunuHesaplaBakalım(int ö, int ü) {
		int ı = ö + ü;
		double j = ö - ü;
		return ı * j;
	}
}
