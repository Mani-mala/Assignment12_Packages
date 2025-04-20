package library;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class LibraryMain {
	    public static void main(String[] args) {
	        Book book1 = new Book("Perfect World", "Harry", "5630062415");
	        Member member1 = new Member("Nivya", "y2343");

	        System.out.println(book1);
	        System.out.println(member1);

	        Transaction borrowTxn = new Transaction(book1, member1, "borrow");
	        Transaction returnTxn = new Transaction(book1, member1, "return");
	        
	        System.out.println(borrowTxn);
	        System.out.println(returnTxn);
	    }
}
