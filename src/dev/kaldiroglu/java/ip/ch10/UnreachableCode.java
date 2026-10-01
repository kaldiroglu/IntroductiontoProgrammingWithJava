package dev.kaldiroglu.java.ip.ch10;

class UnreachableCode {

    public static void main(String[] args) {

//		// Not an unreachable code :)
        int a = 8;
        int k;
        if (a < 11)
            k = 4;
        else
            k = 9;
//
//		System.out.println(k);
//
//		while (true){
//			System.out.println("Selam");
//		}
        int i = 5; // Unreachable code!
//
//		while (false)
//			System.out.println("Selam"); // Unreachable code!
//		int r = 5;

        boolean b1 = false;
//        final boolean b1 = false;

        while (b1)
            System.out.println("Selam"); // Unreachable code if b1 is final!
        int r = 5;
//
////		k = 2;
//		// Unreachable code if break does not exist.
		while (true) {
			System.out.println("Selam");
			k++;
			if(k > 5)
				break;
		}
		int ii = 5; // Unreachable code without break.
//
//
////		That's not unreachable code
//		if (false) {
//			System.out.println("Selam");
//		}
//
//		for (int m = 0; false; m++){
//			System.out.println(m);
//			break;
//		}
//		System.out.println("Break!"); // Unreachable code without a break
//
        for (; ; ) {
            System.out.println("Selam");
            break;
//			System.out.println("Bir selam daha."); // Unreachable code due to break
        }
//
////		for (;;) {
////			System.out.println("Selam");
////			if (true)
////				break;
////			System.out.println("Bir selam daha.");   // Dead code not unreachable code
////		}
//
////		 try {
////		
////		 } catch (IOException e) { // Unreachable code. Try to catch Exception
////		 // or RuntimeException and see what happens
////		
////		 }
//
//		// return;
//		// System.out.println("Son after return"); // Unreachable code!
//	}
//
//	public int f() {
//		if (false) {
//			System.out.println("In if");
//			return 8;
//		} else {
//			System.out.println("in Else");
//			return 0;
//		}
        // System.out.println("Son"); // Unreachable code!
//	}
    }
}
