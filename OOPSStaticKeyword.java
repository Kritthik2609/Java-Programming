class Student {
	String name;
	static int studentCount = 0;
	
	Student(String name) {
		this.name = name;
		studentCount++;
	}
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	public void getStudentName() {
		System.out.println("Name: " + this.name);
	}
}

public class OOPSStaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student("Marco");
		s1.getStudentName();
		
		Student s2 = new Student("Leo");
		s2.getStudentName();
		
		Student s3 = new Student("Victor");
		s3.getStudentName();
		
		int custom = Student.getStudentCount();
		 
		System.out.println("Total Student Count: " + custom);
	}
}
