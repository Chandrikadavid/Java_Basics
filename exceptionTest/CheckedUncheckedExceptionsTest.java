package exceptionTest;

public class CheckedUncheckedExceptionsTest {

	public static void main(String[] args) {

		checkedException();
		unCheckedException();
	}
	
	public static void checkedException() {
		System.out.println("Hello");
		try {
			Thread.sleep(200);
			System.out.println("Guys");
		} catch (InterruptedException ie) {
			System.out.println("Interrupted Exception is handled");
		}
		
	}
	
	public static void unCheckedException() {
		try {
			System.out.println("Result is: " + 10/0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Number cannot be divided by zero");
		}
		
	}

}
