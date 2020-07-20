
public class Educated {

	String fullname;     
	byte   age;          
	float average_grade; 
	byte level;
	String unit;
	
	//public Educated() {}
	public Educated (String fullname, int age, float average_grade, int level) {
		setFullname(fullname);
		setAge(age);
		setAverage_grade(average_grade);
		setLevel(level);
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (byte)age;
	}
	public float getAverage_grade() {
		return average_grade;
	}
	public void setAverage_grade(float average_grade) {
		if(average_grade >=0.0 && average_grade <=10.0) {
			this.average_grade = average_grade;
			} else {
				System.err.println("Error! The average_grade should be in range of 1..10");
				}
		
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = (byte)level;
		this.unit = "class";
	}          

	 public void printInfo() {
	     System.out.println("> fullname: " + fullname + " (" + age + " years)\n" 
	    		 			+ "> " + unit + ": "+ level 
	    		 			+ "\n> grade: " + average_grade
	    		 			+ "\n________________________________________________");
	 }
}