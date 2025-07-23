class Employee {
	String name;
	int id;
	double salary;
	
	public void employeeDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + this.id);
		System.out.println("Salary: " + this.salary);
	}
	
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}

public class OOPSEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Leo", 5, 500000);
		Employee e2 = new Employee("Victor", 10, 250000);
		
		System.out.println("Details of Employee 1");
		e1.employeeDetails();
		
		System.out.println("\nDetails of Employee 2");
		e2.employeeDetails();
	}
}
