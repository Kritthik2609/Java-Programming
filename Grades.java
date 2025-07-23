import java.util.Scanner;

public class Grades {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 90)
			System.out.println("Grade A");
		else if(marks >= 75)
			System.out.println("Grade B");
		else if(marks >= 60)
			System.out.println("Grade C");
		else if(marks >= 40)
			System.out.println("Grade D");
		else
			System.out.println("Fail");
	}
}
