package dev.kaldiroglu.java.ip.hw.ch04.pi;

import java.util.Random;

public class MonteCarloPI {
	public void calculatePI(int numberOfPoints) {
		int dotsInCircle = 0;

		Random random = new Random();
		double start = System.currentTimeMillis();
		for(int i = 0; i<numberOfPoints; i++){
			double x = random.nextFloat();
			double y = random.nextFloat();
			double distance = x*x + y*y;
			if(distance <= 1.0)
				dotsInCircle++;
		}
		double finish = System.currentTimeMillis();
		
		double seconds = (finish-start)/1000;
		double myPI = (double) 4 * dotsInCircle/numberOfPoints;
		
		System.out.println("PI:            " + Math.PI);
		System.out.println("Calculated PI: " + myPI);
		System.out.println("Time to calculate pi is: " + seconds + " .s");
	}
}
