package library.books;

public class Book {
	    private String title;
	    private String author;
	    private String isbn;
	    private boolean isAvailable;
	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isAvailable = true;
	    }
	    public void borrowBook() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println(title + " has been borrowed.");
	        } else {
	            System.out.println(title + " is currently not available.");
	        }
	    }
	    public void returnBook() {
	        isAvailable = true;
	        System.out.println(title + " has been returned.");
	    }
	    public boolean isAvailable() {
	        return isAvailable;
	    }
	    public String getTitle() {
	        return title;
	    }
	    public String getIsbn() {
	        return isbn;
	    }
	    public String toString() {
	        return title + " by " + author + " (ISBN: " + isbn + ")";
	    }
}


