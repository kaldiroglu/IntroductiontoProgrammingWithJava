package dev.kaldiroglu.java.ip.ch02.pi;

import java.util.Random;
import java.util.Scanner;

public class MonteCarloPI {
	public static void main(String[] args) {
		int dotsInCircle = 0;
		System.out.print("Please enter number of points: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Random random = new Random();

		double start = System.currentTimeMillis();
		for(int i = 0; i<n; i++){
			double x = random.nextFloat();
			double y = random.nextFloat();
			double distance = x*x + y*y;
			if(distance <= 1.0)
				dotsInCircle++;
		}
		double finish = System.currentTimeMillis();

		double seconds = (finish-start)/1000;
		double myPI = (double) 4 * dotsInCircle/n;

		System.out.println("PI:            " + Math.PI);
		System.out.println("Calculated PI: " + myPI);
		System.out.println("Time to calculate pi is: " + seconds + " .s");
	}
}