package exceptionTest;

public class CustomExceptionClass extends Exception {

	

	private String message;

	public CustomExceptionClass(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
