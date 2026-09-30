
package dev.kaldiroglu.java.ip.ch07.car;

class CarReferences {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2023";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println("\ncar1:   " + car1.getInfo());
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2016";
		car2.distance = 100_000;
		car2.speed = 160;
		System.out.println("car2:   " + car2.getInfo());
		
		Car tmpCar = car1;
		car1 = car2;
		car2 = tmpCar;
		
		System.out.println("\ncar1:   " + car1.getInfo());
		System.out.println("car2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		car2.accelerate(180);
		car2.go(25);
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		tmpCar.go(50);
		tmpCar.stop();
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());

//		car1 = null;
//		System.out.println(car1.getInfo()); // Trouble!
//		car1.accelerate(150); // Trouble!

		if(car1 != null)
			System.out.println("\ncar1:   " + car1.getInfo());
		else
			System.out.println("\nIt is a null reference!");

		car2 = null;
//		System.out.println(car2.getInfo()); // Trouble!

		tmpCar.accelerate(150);
		tmpCar.go(50);
		System.out.println(tmpCar.getInfo());

		tmpCar = null; // Mercedes will be a lost object, garbage collected.

		tmpCar = new Car();
		tmpCar.go(100);
		tmpCar.accelerate(80);
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		CarFactory bmwCF = new CarFactory();
		Car myBMW = bmwCF.getMeACar();
		System.out.println("myBMW: " + myBMW); // No exception is thrown!
//		myBMW.go(150);

		if(myBMW != null)
			myBMW.accelerate(200);
		else
			System.out.println("Null!!");
	}
}


class CarFactory{
	
	public Car getMeACar() {
		Car car = null;
		
		return car;
	}
}
