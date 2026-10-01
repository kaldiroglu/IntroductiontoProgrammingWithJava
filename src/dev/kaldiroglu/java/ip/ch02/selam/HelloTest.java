package dev.kaldiroglu.java.ip.ch02.selam;

class HelloTest {

	public static void main(String[] args) {
		Hello object = new Hello();
		String answer = object.sayHello("John");
		System.out.println(answer);

        object = new Hello();
        answer = object.sayHello("Maria");
        System.out.println(answer);
	}
}
