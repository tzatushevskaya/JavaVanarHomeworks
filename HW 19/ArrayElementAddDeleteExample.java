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
		for (int i = 0; i < newData.length; i++) {
			if (i<index)
			newData[i] = data[i];
			else
			newData[i] = data[i+1];
		};
		data = newData;
		
	}
	
	public static void addElement(int index, int value) {
		int[] newData = new int[data.length + 1];
		for (int i = 0; i < newData.length; i++) {
			if (i<index)
				newData[i] = data[i];
			else if (i==index)
				newData[i] = value;
			else 
				newData[i] = data[i-1];
		};
		data = newData;
		
	}
	
	public static void addElement(int index, Person value) {
		Person[] newData = new Person[people.length + 1];
		for (int i = 0; i < newData.length; i++) {
			if (i<index)
				newData[i] = people[i];
			else if (i==index)
				newData[i] = value;
			else
				newData[i] = people[i-1];
		};
		people = newData;
		
	}
	
	public static void deleteObject(int index) {
		Person[] newData = new Person[people.length - 1];
		for (int i = 0; i < newData.length; i++) {
			if (i<index)
			newData[i] = people[i];
			else
			newData[i] = people[i+1];
		};
		people = newData;
		
	}

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
