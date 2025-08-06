class Book {
	String Title;
	String Author;
	final int bookID;
	static int bookCounter = 1000;
	final static String Library_Name = "Central Library";
	
	Book() {
		this.bookID = 0;
		Title = "Not yet decided";
		Author = "Unknown";
	}
	
	Book(String Title, String Author) {
		this.Title = Title;
		this.Author = Author;
		this.bookID = 0;
	}
	
	
}

public class BookDetails {

}
