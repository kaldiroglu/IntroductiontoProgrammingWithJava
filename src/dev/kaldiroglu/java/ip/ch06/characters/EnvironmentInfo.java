package dev.kaldiroglu.java.ip.ch06.characters;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;

public class EnvironmentInfo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Encoding:  \t\t" + isr.getEncoding());

		Locale locale = Locale.getDefault();
		System.out.println("Country: \t\t" + locale.getCountry());
		System.out.println("Display language: \t" + locale.getDisplayLanguage());
		System.out.println("Language: \t\t" + locale.getLanguage());
		System.out.println("Display name: \t\t" + locale.getDisplayName());
		System.out.println("ISO3 Language:  \t" + locale.getISO3Language());

		listCharSets();
	}

	/**
	 * Lists all available character sets in the system.
	 */
	public static void listCharSets() {
		SortedMap charsets = Charset.availableCharsets();
		Set names = charsets.keySet();
		for (Iterator e = names.iterator(); e.hasNext();) {
			String name = (String) e.next();
			Charset charset = (Charset) charsets.get(name);
			System.out.println(charset);
			Set aliases = charset.aliases();
			for (Iterator ee = aliases.iterator(); ee.hasNext();) {
				System.out.println("    " + ee.next());
			}
		}
	}
}
