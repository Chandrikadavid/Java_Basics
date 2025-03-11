package realWorldExample;

import java.util.List;

public class Reader implements Runnable{

	private Library library;
	private String action;
	private Book book;
	private List<Book> booksToAddOrDelete;
	
	public Reader(Library library, String action, Book book, List<Book> booksToAddOrDelete) {
		this.library = library;
		this.action = action;
		this.book = book;
		this.booksToAddOrDelete = booksToAddOrDelete;
	}
	
	@Override
	public void run() {
		switch (action) {
		case "addMultipleBooks": {
			library.addMultipleBooks(booksToAddOrDelete);
			break;
		}
		case "addSingleBook": {
			library.addSingleBook(book);
			break;
		}
		case "deleteSingleBook": {
			library.deleteSingleBook(book);
			break;
		}
		case "deleteMultipleBooks": {
			library.deleteMultipleBooks(booksToAddOrDelete);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

}
