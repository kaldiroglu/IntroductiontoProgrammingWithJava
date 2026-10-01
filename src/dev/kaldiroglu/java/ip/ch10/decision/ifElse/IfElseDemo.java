package dev.kaldiroglu.java.ip.ch10.decision.ifElse;

class IfElseDemo {

    public static void main(String[] args) {
    	
        int score = 87; // And try with 57
        
        char grade;

       if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }
       else {	// Comment out this else see what happens to grade variable
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);

        if(grade == 'A' || grade == 'B')
        	System.out.println("👏👏👏👏👏👏");

        if(grade < 'D')
            System.out.println("👏");

        if(grade == 'F')
        	System.out.println("😩");
    } 
}
