package dev.kaldiroglu.java.ip.ch04.compact;

public class Selam{

	String world = "millet";

	public String selamSoyle(String kime) {
		String selamlama;
		if (kime != "")
			selamlama = "Selam " + kime + " :)";
		else
			selamlama = "Selam " + world + " :)";
		return selamlama;
  }
}