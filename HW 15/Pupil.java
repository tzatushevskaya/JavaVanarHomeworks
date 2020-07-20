
public class Pupil extends Educated{
	
	public String school_name;
	
	public Pupil(String fullname, int age, float average_grade, int level, String school_name) {
		super(fullname, age, average_grade, level);
		setSchool_name(school_name);
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	@Override
	public void setAge(int age) {
		if(age >=6 && age <=20) {
			this.age = (byte)age;
			} else {
				System.err.println("Error! The age of a pupil must be in range from 6 to 20");
				}
	}
	
	@Override
	public void setLevel(int level) {
		if(level >=1 && level <=12) {
			this.level = (byte)level;
			} else {
				System.err.println("Error! The level of a pupil must be in range from 1 to 12");
				}
		this.unit = "class";
	}

	@Override
	 public void printInfo() {
	     System.out.println("> fullname: " + fullname + " (" + age + " years)\n" 
	    		 			+ "> " + unit + ": "+ level 
	    		 			+ "\n> grade: " + average_grade 
	    		 			+ "\n> school: " + school_name
	    		 			+ "\n________________________________________________");
	 }

}
