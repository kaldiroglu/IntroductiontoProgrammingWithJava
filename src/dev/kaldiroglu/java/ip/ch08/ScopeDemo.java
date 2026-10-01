package dev.kaldiroglu.java.ip.ch08;

class ScopeDemo {
	// Instance variable
	//int j = i;
	int i = 111_111;
	String ij = "Naber abi";

	public static void main(String[] args) {
		int i = 0;
		String ij = "Java";
		System.out.println(i);
		System.out.println(ij);
//		int i = 2;  // Duplicated variable
//		int ii;
		for (; i < 5; i++) {
			System.out.println(i);
			if (i < 3) {
				// Can't say this.
//				 boolean i = true;
				int ii = 3;
				int a;
				f(ii);
			} else if (3 < i & i < 12) {
				int ii = 8;
				f(ii);
			} else {
				int ii = 17;
				f(ii);
			}
			int ii = 11;
			System.out.println(ii);
		}
	}

	public static void f(int i) {
		// Can't say this.
//		 int i = 4; // A parameter with the same name is passed
//		int k = 0;
		{
			int k = 7;
			System.out.println(i);
			System.out.println(k);
		}
		//System.out.println(k);
		System.out.println(i);
	}
	
	public void f() {
//		int i = 5;
		System.out.println(i);
	}

	public void ff() {
		int i = 6;
		System.out.println(i);
		System.out.println(ij);;
	}

	/**
	 * Can't reference a variable that is defined later in the scope.
	 */
	public void forwardReference() {
//		int i = j;
//		int j = 7;
		System.out.println(i);
		System.out.println(ij);;
	}
}
