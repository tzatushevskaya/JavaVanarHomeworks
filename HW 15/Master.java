
public class Master extends Student{

	public Master(String fullname, int age, float average_grade, int level, String school_name, String university_name, String speciality) {
		super(fullname, age, average_grade, level, school_name, university_name, speciality);
	}
	
	@Override
	public void setAge(int age) {
		if(age >=22 && age <=33) {
			this.age = (byte)age;
			} else {
				System.err.println("Error! The age of a master must be in range from 22 to 33");
				}
	}
	
	@Override
	public void setLevel(int level) {
		if(level >=1 && level <=3) {
			this.level = (byte)level;
			} else {
				System.err.println("Error! The level of a master must be in range from 1 to 3");
				}
		this.unit = "year";
	}
}
