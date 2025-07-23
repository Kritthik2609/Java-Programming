import java.util.Scanner;
public class OddRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the limit: ");
		int limit = sc.nextInt();
		
		System.out.println("The odd numbers upto " + limit + " is");
		
		for(int i = 0; i < limit; i++) {
			if(i % 2 == 0) {
				continue;
			}	
			else {
				System.out.println(i);
			}	
		}
	}
}
