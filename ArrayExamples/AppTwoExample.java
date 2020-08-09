package main;

import java.util.Random;
import java.util.Scanner;

public class AppTwoExample {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] values;
		int size;
		
		System.out.println ("How big do you want it?");
		size = in.nextInt();
		
		values = new int[size];
		
		if (values != null && values.length == size) {
			System.out.println ("SUCCESS!!");
		} else {
			System.out.println ("COULD NOT CREATE THE ARRAY!");
		}
		
		Random r = new Random();
		
		// put random values inside
		for (int i = 0; i < values.length; i++) {
			values[i] = r.nextInt(1000);
		}
		
		
		// show values inside
		for (int i = 0; i < values.length; i++) {
			System.out.println ("[" + i + "]" + values[i]);
		}
		
	}

}
