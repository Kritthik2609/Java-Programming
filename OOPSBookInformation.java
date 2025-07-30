class Book {
	String title;
	String author;
	double price;
	int quantity;
	double total_value;
	
	public void displayTotalValue() {
		total_value = price * quantity;
	}
	
	public void displayDetails() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity: " + this.quantity);
		
		displayTotalValue();
		System.out.println("Total Value: " + this.total_value);
	}
	
	Book(String title, String author, double price, int quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
}

public class OOPSBookInformation {
	public static void main(String[] args) {
	Book b1 = new Book("The 5AM Club", "Robin Sharma", 700.00, 25);
	b1.displayDetails();
	
	System.out.print("\n");
	
	Book b2 = new Book("Tinkle Digest", "Anant Pai", 500.00, 10);
	b2.displayDetails();
	}
}
