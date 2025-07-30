class Student {
	String name;
	int roll_number;
	int marks1, marks2, marks3;
	float average;
	
	public void calculateAverage() {
		average = (marks1 + marks2 + marks3)/3;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Roll Number: " + this.roll_number);
		System.out.println("Subject 1: " + marks1);
		System.out.println("Subject 2: " + marks2);
		System.out.println("Subject 3: " + marks3);
		System.out.println("Average of 3 subjects: " + average);
	}
	
	Student(String name, int roll_number, int marks1, int marks2, int marks3) {
		this.name = name;
		this.roll_number = roll_number;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		
	}
}

public class OOPSStudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student("Marco", 5, 95, 97, 100);
		s1.calculateAverage();
		s1.displayDetails();
		
		System.out.print("\n");
		
		Student s2 = new Student("Leo", 7, 93, 97, 95);
		s2.calculateAverage();
		s2.displayDetails();
	}
}
