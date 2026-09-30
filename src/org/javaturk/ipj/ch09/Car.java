package org.javaturk.ipj.ch09;

class Car {
	 String make;
	 String model;
	 String year;
	 int speed;
	 int distance;
	
	 double go(int newDistance) {
		distance += newDistance;
		double period = (double) newDistance / speed;
		return period;
	}

	 void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	 void stop() {
		speed = 0;
	}

	 String getInfo() {
		String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
		return info;
	}
}
