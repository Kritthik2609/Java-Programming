class Book {
	String Title;
	String Author;
	final int bookID;
	static int bookCounter = 1000;
	final static String LIBRARY_NAME = "Central Library";
	
	Book() {
		Title = "Not yet decided";
		Author = "Unknown";
		this.bookID = bookCounter++;
	}
	
	Book(String Title, String Author) {
		this.Title = Title;
		this.Author = Author;
		this.bookID = bookCounter++;
	}
	
	public void displayInfo() {
		System.out.println("Book: " + Title);
		System.out.println("Author: " + Author);
		
	}
	
	public void displayInfo(boolean showLibrary) {
		if(showLibrary) {
			displayInfo();
			System.out.println("Library Name: " + LIBRARY_NAME);
		}
	}
	
	public static void displayTotalBooks() {
		System.out.println("Total Books: " + (bookCounter - 1000));
	}
	
}

public class OOPSBookDetails {
	public static void main(String[] args) {
		Book book = new Book();
		book.displayInfo(true);
		book.displayTotalBooks();
	}
}
