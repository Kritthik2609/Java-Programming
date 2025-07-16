import java.util.Scanner;

public class NumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a limit: ");
		int custom = sc.nextInt();
		
		System.out.print("The numbers upto ");
		System.out.println(custom + " is");
		
		for(int i = 1; i <= custom; i++) {
			System.out.println(i);
		}
	}
}
