package exceptionTest;

public class InvalidAccountException extends Exception{
	
	String message;
	
//	public InvalidAccountException(String message) {
//		this.message = message;
//	}
	
	public String getMessage() {
		return message;
	}
}
