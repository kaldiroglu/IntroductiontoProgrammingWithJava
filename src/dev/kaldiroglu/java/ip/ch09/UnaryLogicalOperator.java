package dev.kaldiroglu.java.ip.ch09;

class UnaryLogicalOperator {

	public static void main(String[] args) {
		boolean b1 = true;
//		!b1; // Error!
		b1 = !b1;
		System.out.println(b1);
		
//		b1 != b1; // Can't do that! != is not a compound assignment, it is a relational operator.!
	}
}
