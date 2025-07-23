class Student {
	String name;
	int age;
	
	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}

public class OOPSStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "Marco";
		s1.age = 27;
		
		s1.displayDetails();
	}
}
