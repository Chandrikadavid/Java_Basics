package exceptionTest;

public class ThrowsExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			customException();
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			useMyCustomExceptionClass();
		} catch (Exception e) {
			System.out.println("My own cutom exception");
			// TODO: handle exception
		}
	}
	
	public static void customException() throws Exception {
		throw new Exception("It is custom exception");
	}
	
	public static void useMyCustomExceptionClass() throws Exception {
		throw new CustomExceptionClass("This is my custom exception class");
	}

}
