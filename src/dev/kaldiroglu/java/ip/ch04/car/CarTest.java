package dev.kaldiroglu.java.ip.ch04.car;

class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();

		System.out.println("When the car stands still.");
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2026";
		car1.distance = 0;
		car1.speed = 0;
		String info = car1.getInfo();
		System.out.println(info);

		System.out.println("\nWhen the car moves.");
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());

		car1.stop();
		System.out.println(car1.getInfo());

		System.out.println();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2017";
		car2.distance = 120_000;
		car2.speed = 160;
		System.out.println(car2.getInfo());

		car2.accelerate(250);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km " + timeToGo + " hour.");
		System.out.println(car2.getInfo());

		car2.stop();
		System.out.println(car2.getInfo());

		Car car3 = null;
		
		car3 = new Car();
		System.out.println(car3.getInfo());
	}
}

