package dev.kaldiroglu.java.ip.ch06.characters;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Escapes {

	public static void main(String[] args) {

		System.out.println("Backspace: " + "I \blove " + '\b' + "Java");
		System.out.println("This is a tab\t and this is another tab\t.");
		System.out.println("Linefeed: " + '\n');
		System.out.println("Form feed: " + '\f');
		System.out.println("This is a carriage" + '\r' + "return.");
		System.out.println("Apostrophe-quote: " + '\'');
		System.out.println("Quotation mark: " + "\"Ali'nin\"");
		System.out.println("Backslash: " + '\\');
	}
}
