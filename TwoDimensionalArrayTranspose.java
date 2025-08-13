import java.util.Scanner;

public class TwoDimensionalArrayTranspose {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows the matrix: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the number of columns the matrix: ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		int[][] trans = new int[rows][cols];
		
		System.out.println("Enter the matrix elements: ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("The original matrix is");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				trans[i][j] = matrix[j][i];
			}
		}
		
		System.out.println();
		System.out.println("The tranposed matrix is");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(trans[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
