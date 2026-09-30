package dev.kaldiroglu.java.ip.ch11;

import java.util.Arrays;
import java.util.Random;

class ArraysDemo {
	
	int[] intArray = new int[20];
	Pizza[] pizzalar = new Pizza[3];
	boolean[] flags = { true, false };
	String[] names = {"Ğaye", "Mesut", "Akın", "Gamze", "Kerem", "Şükran", "İsmail", "ismail", "Ishmael", "Zeynep"};

	public void initialize() {
		for (int i = 0; i < intArray.length; i++) {
			Random r = new Random();
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}
		
		System.out.print("Original array: ");
		print(intArray);

		pizzalar[0] = new Pizza("Peynirli");
		pizzalar[1] = new Pizza("Sucuklu");
		pizzalar[2] = new Pizza("Sebzeli");
	}

	public static void main(String[] args) {
		ArraysDemo demo = new ArraysDemo();
		demo.initialize();
//		demo.copy();
//		demo.copyRange();
//		demo.fill(11);
//		demo.sort();
		demo.search(5);
	}

	public void copy() {
		System.out.println("\nCopying the array: ");
		int[] copiedArray1 = Arrays.copyOf(intArray, intArray.length);
		System.out.print("Whole copy: ");
		print(copiedArray1);
		
		System.out.print("Only 0 to 4 copy: ");
		int[] copiedArray2 = Arrays.copyOf(intArray, 5);
		print(copiedArray2);

		System.out.print("Using padding with 0s: ");
		int[] copiedArray3 = Arrays.copyOf(intArray, 30);
		print(copiedArray3);
	}

	public void copyRange() {
		System.out.println("\nCopying the range of the array: ");
		int[] copy = Arrays.copyOfRange(intArray, 5, 15);
		System.out.print("Range 5 to 15 copy: ");
		print(copy);
	}

	public void fill(int key) {
		System.out.print("\nFilling an array with " + key + ": ");
		// Filling an array
		Arrays.fill(intArray, key);
		print(intArray);
	}

	public void sort() {
		print(names);
		System.out.print("\nSorting an array: ");
		Arrays.sort(names);
		print(names);
	}
	
	public void search(int key) {
		System.out.println("\nSearching " + key + " in an array");
		intArray[0] = 5;
		// Searching an array
		Arrays.sort(intArray);
		print(intArray);
		int index = Arrays.binarySearch(intArray, key);
		System.out.println("Index of " + key + ": " + index);
	}

	public void print(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}

	public void print(String[] sArray) {
		for (int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i] + " ");
		}
		System.out.println();
	}
}
