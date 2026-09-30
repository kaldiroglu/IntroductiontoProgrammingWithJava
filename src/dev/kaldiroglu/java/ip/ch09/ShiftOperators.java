package dev.kaldiroglu.java.ip.ch09;

class ShiftOperators {

	public static void main(String[] args) {
		makePositiveShifts();
//		makeNegativeShifts();
//		makeUnsignedShifts();
//		shiftCircular();
	}

	 static void makePositiveShifts() {
		System.out.println("\n*** makePositiveShifts() ***");
		int i = 1; // 0000 0000 0000 0001
		System.out.println("i:         " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i << 1; // 0000 0000 0000 0010
		System.out.println("i << 1:    " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i << 6; // 0000 0000 1000 0000
		System.out.println("i << 6:  " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 1; // 0000 0000 0000 0001
		System.out.println("i >> 1:   " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 7; // 0000 0000 0000 0000
		System.out.println("i >> 7:    " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		
		System.out.println();
		
		// If the number is not even then right shift would produce 
		i = 139; // 0000 0000 1000 1011
		System.out.println("i:         " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 1; // 0000 0000 0100 0101
		System.out.println("i >> 1:     " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 1; // 0000 0000 0010 0010
		System.out.println("i >> 1:     " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
	}
	
	 static void makeNegativeShifts() {
		System.out.println("\n*** makeNegativeShifts() ***");
		int i = -1; // 0000 0000 0000 0001
		System.out.println("i:         " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i << 1; // 0000 0000 0000 0010
		System.out.println("i << 1:    " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i << 6; // 0000 0000 1000 0000
		System.out.println("i << 6:    " + i + "  Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 6; // 0000 0000 0000 0001
		System.out.println("i >> 6:    " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 1; // 0000 0000 0000 0000
		System.out.println("i >> 1:    " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
	}
	
	 static void makeUnsignedShifts() {
		System.out.println("\n*** makeUnsignedShifts() ***");
		int i = 64; 
		System.out.println("i:         " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >>> 5; 
		System.out.println("i >> 5:     " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		
		i = -64; 
		System.out.println("i:        " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));
		i = i >>> 5; 
		System.out.println("i >>> 5:  " + i + "    Binary: " + BitwiseLogicalOperators.getBinary(i));

		int z = 1;
		int zz = z >>> 1;
		System.out.println("zz: " + zz);

	}
	
	 static void shiftCircular() {
		System.out.println("\nshiftCircular");
		int i = 64; 
		System.out.println("i:         " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 5; 
		System.out.println("i >> 5:     " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		
		i = 64; 
		System.out.println("i:         " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		i = i >> 37; 
		System.out.println("i >> 37:    " + i + "    Binary:  " + BitwiseLogicalOperators.getBinary(i));
		
	}
}
