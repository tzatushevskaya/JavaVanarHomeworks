package main;

public class ArrayCustomClassExampleApp {
	
	public static void main(String args[]) {
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog ("Shurik","Bulldog",1990, 10.0f);
		dogs[1] = new Dog ("Laska","Layka",2010, 1.5f);
		dogs[2] = new Dog ("Lev","Kaukasian",2015, 3.0f);
		
//		for(int i=0; i < dogs.length; i++) {
//			System.out.println(dogs[i]);
			
		// swap
			
		Dog temp = dogs[1];
			dogs[1]=dogs[2];
			dogs[2]=temp;
			
		// process +5% weight
		for(int i=0; i < dogs.length; i++) {
			if(dogs[i] != null) {
				dogs[i].setWeightKg(dogs[i].getWeightKg() * 1.05f);
			}
				
		}
		
		// remove last value
		
		dogs[dogs.length-1]=null;
		
		// find a value

		for(int i=0; i < dogs.length; i++) {
			if(dogs[i] != null) {
				dogs[i-1] = null;
			}
				
		}
		
		
		for(int i=0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
			
		}
	}

}

class Dog {
	
	private String name;
	private String race;
	private int year;
	private float weightKg;
	
	public Dog (String name, String race, int year, float weightKg) {
		this.name = name;
		this.race = race;		
		this.year = year;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(float weightKg) {
		this.weightKg = weightKg;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", race=" + race + ", year=" + year + ", weightKg=" + weightKg + "]";
	}


	
}