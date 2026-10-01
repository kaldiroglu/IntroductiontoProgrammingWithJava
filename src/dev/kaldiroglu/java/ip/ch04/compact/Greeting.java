/*
 * We see here 2 enhancements that came with JDK 25:
 * - No need to declare a class for valid Java code, a compact method is enough
 * - No need to declare compact methods as public static void compact(String[] args),
 *   now it is much more succint: void compact()
 */

import dev.kaldiroglu.java.ip.ch04.compact.Hello;
import dev.kaldiroglu.java.ip.ch04.compact.Selam;

Random random = new Random();

String start = "*** Greeting Example ***";

public void main() {
    System.out.println(start);
    saySalam();
    sayHello();
}

void saySalam() {
    Selam s = new Selam();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(s.selamSoyle("Nalan"));

}

void sayHello() {
    Hello h = new Hello();
    int limit = random.nextInt(10);
    for (int i = 0; i < limit; i++)
        System.out.println(h.sayHello("Jane"));
}

/*
class Selam{

	String world = "millet";

	public String selamSoyle(String kime) {
		String cumle;
		if (kime != "")
			cumle = "Naber " + kime + " :)";
		else
			cumle = "Naber " + world + " :)";
		return cumle;
  }
}
*/

 

