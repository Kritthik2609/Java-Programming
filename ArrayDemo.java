import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		
		for(int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("The array elements are");
		
		for(int num: array) {
			System.out.print(num + "\t");
		}
	}
}
