public class ArrayElementAddDeleteExample {
	
	public static void main (String args[]) {
		

		int indexToDelete = 2;
		int newValue = -10;
		int indexToInsert = 2;
		deleteElement(indexToDelete);
		printArray();
		addElement(indexToInsert, newValue);
		printArray();
		
		people[0] = new Person ("Shurik");
		people[1] = new Person ("Laska");
		people[2] = new Person ("Shur");
		people[3] = new Person ("Las");
		Person man = new Person ("Andrew");
		deleteObject(indexToDelete);
		printArrayOfObjects();
		addElement(indexToInsert, man);
		printArrayOfObjects();
		
		

		
	}
	
	static int[] data = {10,20,30,40,50};
	static Person[] people = new Person[4];




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
	
	public static void addElement(int index, Person value) {
		Person[] newData = new Person[people.length + 1];
		for (int i = 0; i < index; ++i) {
			newData[i] = people[i];
		};
		newData[index] = value;
		for (int i = index+1; i < people.length+1; ++i) {
			newData[i] = people[i-1];
		};
		people = newData;
		
	}
	
	public static void deleteObject(int index) {
		Person[] newData = new Person[people.length - 1];
		for (int i = 0; i < index; ++i) {
			newData[i] = people[i];
		};
		for (int i = index; i < people.length-1; ++i) {
			newData[i] = people[i+1];
		};
		people = newData;
		
	}
	
//	public static void printArray() {
//		System.out.println("#####################");
//		for (int i=0; i < data.length; i++) {
//			System.out.print( data[i] + " ");
//		}
//		System.out.println();
//		for (int i=0; i < data.length; i++) {
//			System.out.print( i + " ");
//		}
//		System.out.println("\n#####################\n");
//	}
	
	public static void printArray() {
		System.out.println("#####################");
		for (int element : data) 
		{ 
			System.out.print( element + " ");
		}
		System.out.println("\n#####################\n");
	}
	
	public static void printArrayOfObjects() {
		System.out.println("#####################");
		for (Person element : people) 
		{ 
			System.out.print( element + " ");
		}
		System.out.println("\n#####################\n");
	}
	
}
