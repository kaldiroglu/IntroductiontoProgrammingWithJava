package dev.kaldiroglu.java.ip.ch10.decision.switchCase;

class StringInSwitchDemo {

	public static void main(String[] args) {
		String dayInEnglish = "friday";
		
		final String s = "sunday"; // Constant exp.
		String gün;
		switch(dayInEnglish){
			case "monday":		gün = "Pazartesi"; break;
			case "tuesday":		System.out.println("Sali"); 	break;
			case "wednesday":	System.out.println("Çarsamba"); break;
			case "thursday":	System.out.println("Persembe"); break;
			case "friday":		System.out.println("Cuma"); 	break;
			case "saturday":	System.out.println("Cumartesi");break;
			case s:				System.out.println("Pazar"); 	break;
			// No default. Problem!
		}
	}
}
