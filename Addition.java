import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		int custom  = num1 + num2;
		
		System.out.print("The sum of the two numbers is: ");
		System.out.println(custom);
	}
}
