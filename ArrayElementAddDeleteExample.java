
public class ArrayElementAddDeleteExample {
	
	public static void main (String args[]) {
		

		int indexToDelete = 2;
		int newValue = -10;
		int indexToInsert = 2;
		deleteElement(indexToDelete);
		printArray();
		addElement(indexToInsert, newValue);
		printArray();
		
		

		
	}
	
	static int[] data = {10,20,30,40,50};

	public static void deleteElement(int index) {
		int[] newData = new int[data.length - 1];
		for (int i = 0; i < index; ++i) {
			newData[i] = data[i];
		};
		for (int i = index; i < data.length-1; ++i) {
			newData[i] = data[i+1];
		};
		data = newData;
		
	}
	
	public static void addElement(int index, int value) {
		int[] newData = new int[data.length + 1];
		for (int i = 0; i < index; ++i) {
			newData[i] = data[i];
		};
		newData[index] = value;
		for (int i = index+1; i < data.length+1; ++i) {
			newData[i] = data[i-1];
		};
		data = newData;
		
	}
	
	public static void printArray() {
		System.out.println("#####################");
		for (int i=0; i < data.length; i++) {
			System.out.print( data[i] + " ");
		}
		System.out.println();
		for (int i=0; i < data.length; i++) {
			System.out.print( i + " ");
		}
		System.out.println("\n#####################\n");
	}
	
}
