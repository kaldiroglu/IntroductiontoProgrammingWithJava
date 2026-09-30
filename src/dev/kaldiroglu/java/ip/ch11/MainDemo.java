package dev.kaldiroglu.java.ip.ch11;

class MainDemo {

	public static void main(String[] args) {

		if (args.length == 3) {
			String name = args[0];
			String lastName = args[1];
			String age = args[2];
			System.out.println("You've provided: " + name + " " + lastName + " " + age);
		} else {
			System.out.println("Please provide three arguments!");
			System.exit(1);
		}

		int length = args.length;
		System.out.println(length + " tane arguman gectin.");

		for (String s : args)
			System.out.println(s);

		// Parse age to get int value
		int intAge = Integer.parseInt(args[2]);
		int yearOfBirth = 2026 - intAge;
		System.out.println(yearOfBirth + " yılında doğdun.");
	}
}
