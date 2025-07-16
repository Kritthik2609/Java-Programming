import java.util.Scanner;

public class NameAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		 
		 System.out.print("Hi " + name + "!!, your age is " + age + ".");
	}
}
