package realWorldExample;

import java.util.List;

public class RunnerClass {

	public static void main(String[] args) {
		Library lib = new Library();
		
		Book book1 = new Book("Java");
		Book book2 = new Book("Python");
		Book book3 = new Book("Java DS");
		
		Thread th1 = new Thread(new Reader(lib, "addSingleBook", book1, null));
		Thread th2 = new Thread(new Reader(lib, "addMultipleBooks", null, List.of(book2,book3)));
		Thread th3 = new Thread(new Reader(lib, "deleteSingleBook", book1, null));
		Thread th4 = new Thread(new Reader(lib, "deleteMultipleBooks", null, List.of(book2)));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
