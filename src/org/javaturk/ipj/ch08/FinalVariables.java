package org.javaturk.ipj.ch08;

import org.javaturk.ipj.ch07.car.Car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class FinalVariables {
	final static String name = "Akin";

	public static void main(String[] args) {

//		name = "Kaldiroglu";

		final int i = 8;
		System.out.println(i);

		// Illegal
//		 i = 7;
//		 i++;

		// Following is not illegal
		final long l; // Blank final
//		System.out.println(l);
		l = 7;
		
//		l = 8; // That's illegal
		System.out.println(l);
		
//		Following is ok.
		int x = 3;
		int y = 8;
		final int j;

		if (x > y)
			j = 9;
		else
			j = 11;

		System.out.println(i);
		
		final Car c1 = new Car();
		//c1 = new Car();
		c1.make = "Porche";
		Car c3 = c1;

		final Car c2; // Blank final
		c2 = new Car();
//		c2 = new Car();

//		int const;
//		const int u = 5;
	}
}
