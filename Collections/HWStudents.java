package homework;

import java.util.ArrayList;

public class HWStudents {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();  
		
		ArrayList<Student> bestStudents =  new ArrayList<Student>();  
			
		// 1) added 5 students
		
			students.add( new Student("Andrew Allen","IT",9.5f) );
			students.add( new Student("Boris Brown","FE",6.5f));
			students.add( new Student("Calvin Carry","FF",9.9f) );
			students.add( new Student ("David Denman", "IT", 3.0f) );
			students.add( new Student ("Erick Clapton", "FF", 7.9f) );

		// 2) best student index search
			
			Float max = 0f;
			int indexOfTheBest = 0;
			for (Student student : students) {
				if(student.getGrade() >= max) {
					max = student.getGrade();
					indexOfTheBest++;
				}
			}
				System.out.println(indexOfTheBest);
		
		// 3) increasing his mark by addressing via index + list
			
			(students.get(indexOfTheBest)).setGrade((students.get(indexOfTheBest)).getGrade()+0.1f);
			
		// 4) creating list of the best students
			
			for (Student student : students) {
				if(student.getGrade() >= 8.0f) {
					bestStudents.add(student);
				}
			}
			
		// 5) print both
			
			printArrayList(students);
			
			printArrayList(bestStudents);
				
		}
	
	
		public static void printArrayList(ArrayList<Student> students) {
			int index = 0;
			System.out.println("############################");
			for (Student student : students) {
				System.out.println("[" + index + "] ==> " + student);
				index++;
			}
			System.out.println("############################\n");
		}
	}

class Student{

	String fullname;
    String specialty;
    Float  grade;
    
    public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}

	public Student(String fullname, String specialty, Float grade) {
		super();
		this.fullname = fullname;
		this.specialty = specialty;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", specialty=" + specialty + ", grade=" + grade + "]";
	}
    

}
