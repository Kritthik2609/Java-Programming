import java.util.Scanner;

public class CopyingArrayElements {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements of the array: ");
		int custom = sc.nextInt();
		
		int[] array1 = new int[custom];
		int[] array2 = new int[custom];
		
		System.out.println("Enter the array elements");
		
		for(int i = 0; i < custom; i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("The original array is");
		
		for(int i = 0; i < custom; i++) {
			System.out.print(array1[i] + "\t");
		}
		
		for(int i = 0; i < custom; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("\n");
		System.out.println("The copied array is");
		
		for(int i = 0; i < custom; i++) {
			System.out.print(array2[i] + "\t");
		}
	} 
}
