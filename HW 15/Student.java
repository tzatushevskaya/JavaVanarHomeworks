
public class Student extends Pupil{
	
	public String university_name;
	public String speciality;

	public Student(String fullname, int age, float average_grade, int level, String school_name, String university_name, String speciality) {
		super(fullname, age, average_grade, level, school_name);
		setUniversity_name(university_name);
		setSpeciality(speciality);
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void setAge(int age) {
		if(age >=19 && age <=30) {
			this.age = (byte)age;
			} else {
				System.err.println("Error! The age of a student must be in range from 19 to 30");
				}
	}
	
	@Override
	public void setLevel(int level) {
		if(level >=1 && level <=7) {
			this.level = (byte)level;
			} else {
				System.err.println("Error! The level of a student must be in range from 1 to 7");
				}
		this.unit = "course";
	}

	@Override
	 public void printInfo() {
	     System.out.println("> fullname: " + fullname + " (" + age + " years)\n" 
	    		 + "> " + unit + ": "+ level 
	    		 + "\n> grade: " + average_grade 
	    		 + "\n> school: " + school_name 
	    		 + "\n> university: " + university_name
	    		 + "\n> speciality: " + speciality
	    		 + "\n___________________________________________________________");
	 }

}
