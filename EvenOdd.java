import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0)
			System.out.print(number + " is an even number");
		else
			System.out.print(number + " is an odd number");
	}
}
