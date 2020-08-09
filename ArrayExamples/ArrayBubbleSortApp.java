package main;

public class ArrayBubbleSortApp {
	
	public static void main(String[] args) {
		
		int[] data = {-20, 0, 20, -50, 50};
		
		data = sort(data,true);
		
		for (int d:data) {
			System.out.println(d);
		}
	}
	
	static int temp;
	static boolean swapped;
		
		public static int[] sort(int[] array, boolean desc) {
			for (int j=0; j < array.length; j++) {
				swapped = false;
				for (int i=0; i < array.length - 1; i++) {
					if (desc) {
						if (array[i] < array[i+1]) {
							swap(array, i);
						}
					} else {
						if (array[i] > array[i+1]) {
							swap(array, i);
						}
					}
				}
				if (swapped = false) break;
			}
			return array;
			
		}
		
		public static void swap(int[] array, int i) {
			temp = array[i];
			array[i] = array[i+1];
			array[i+1]= temp;
			swapped = true;
		}
	
}
	

