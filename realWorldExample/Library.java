package realWorldExample;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<Book>();
	
	public synchronized void addMultipleBooks(List<Book>newBooks) {
		books.addAll(newBooks);
		System.out.println("All books are added");
	}
	
	public synchronized void addSingleBook(Book book) {
		books.add(book);
		System.out.println("Added single book");
	}
	
	public synchronized void deleteSingleBook(Book book) {
		books.remove(book);
		System.out.println("Deleted single book ");
	}
	
	public synchronized void deleteMultipleBooks(List<Book> booksToDelete) {
		books.removeAll(booksToDelete);
		System.out.println("Multiple books deleted");
	}
	
}
