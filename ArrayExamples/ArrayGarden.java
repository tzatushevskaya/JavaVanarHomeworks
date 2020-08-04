package main;

import java.util.Arrays;

public class ArrayGarden {
	
	static final int SIZE = 10;
	static char[] garden = new char [SIZE];
	final static char[] LOCALVEGS = {'_', 'o', 'v', 'Y'};
	
	public static void main (String[] args) {
	
		// MAP OF GARDEN
		
		// char - ''
		
		// LEGEND
		// '_' - empty
		// 'o' - potato
		// 'v' - carrot
		// 'Y' - corn
		
		
		Arrays.fill(garden,'_');
		
		putInGarden(2, 'Y');
		putInGarden(3, 'Y');
		putInGarden(4, 'Y');
		putInGarden(6, 'z');
		char taken = takeFromGarden(3);
		System.out.println(taken + " was removed!");
		swapInGarden(2, 3);
		
		printGarden();
		
		System.out.println("Corn Stats: " + countInGarden('Y'));
		System.out.println("Potato Stats: " + countInGarden('o'));
		
	}
	
	public static void putInGarden(int index, char value) {
		if (checkIndex(index) && isEmpty(index)) {
			if (isLocalVegetable(value))
		// 1) check if index is correct! >>> checkIndex boolean
		// 2) NO OVERRIDE - empty before put
		// 3) check value - '_', 'Y', 'o', 'v'
		garden[index] = value;
			else System.err.println("Unacceptable plant value");
		}
		else System.err.println("Unacceptable index value");
		
	}
	
	public static char takeFromGarden(int index) {
		if (checkIndex(index)) {
		char temp = garden[index];
		garden[index] = '_';
		return temp;
		} else {
			System.err.println("Unacceptable index value");
			return '-';
		}
	}
	
	public static int countInGarden ( char value) {
		int count = 0;
		for (int i = 0; i < garden.length; i++) {
			if (garden[i]==value)
				count++;
		}
		return count;
	}
	
	public static boolean swapInGarden ( int index1, int index2) {
		if (checkIndex(index1) && checkIndex(index2)) {
		 char temp = garden [index1];
		 garden [index1]=garden [index2];
		 garden [index2]=temp;
		 return true;
		} else {
			System.err.println("Check your input for inacceptable index value(s)");
			return false;
		}
	}
	
	private static boolean checkIndex(int index) {
		if (index >=0 && index < garden.length)
			return true;
		else return false;
	}
	
	private static boolean isEmpty(int index) {
		if (garden[index] == '_')
			return true;
		else return false;
	}
	
	private static boolean isLocalVegetable(char value) {
		int count = 0;
		for (char element : LOCALVEGS) {
			if (element==value)
				count++;
		}
		return (count==1 ? true : false);
	}
	
	public static void printGarden() {
		System.out.println("#####################");
		for (int i=0; i < garden.length; i++) {
			System.out.print( garden[i] + " ");
		}
		System.out.println();
		for (int i=0; i < garden.length; i++) {
			System.out.print( i + " ");
		}
		System.out.println("\n#####################\n");
	}

}
