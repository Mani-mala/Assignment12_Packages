package library.transactions;
import library.books.Book;
import library.members.Member;
public class Transaction {
	    private Book book;
	    private Member member;
	    private String type;
	    public Transaction(Book book, Member member, String type) {
	        this.book = book;
	        this.member = member;
	        this.type = type;
	        if ("borrow".equalsIgnoreCase(type)) {
	            book.borrowBook();
	        } else if ("return".equalsIgnoreCase(type)) {
	            book.returnBook();
	        }
	    }
	    public String toString() {
	        return  type+ " Details : \n" + book.getTitle() +" book "+ type +"ed  by " + member.getName();
	    }
}


