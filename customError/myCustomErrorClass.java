package customError;

public class myCustomErrorClass extends Error {

	String message;

	public myCustomErrorClass(String string) {
		this.message = message;
	}
	
	public void logErrorDetails() {
		System.out.println("Custom Error Details" + getMessage());
	}
}
