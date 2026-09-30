package org.javaturk.ipj.ch08;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();

		System.out.println("When the car stands still.");
		System.out.println(car1.getInfo());

		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2025";
		car1.distance = 0;
		car1.speed = 0;

		System.out.println(car1.getInfo());

		System.out.println("\nWhen the car moves.");
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());

		System.out.println("\nWhen the car stops.");
		car1.stop();
		System.out.println(car1.getInfo());

		System.out.println();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2022";
		car2.distance = 10_000;
		car2.speed = 160;
		System.out.println(car2.getInfo());

		car2.accelerate(200);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km " + timeToGo);
		car2.stop();
		System.out.println(car2.getInfo());
	}
}
