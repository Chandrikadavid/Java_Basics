package customError;

public class RunnerClass {

	public static void main(String[] args) {

		try {
			throw new myCustomErrorClass("This is my Custom Error Class");
		} catch (Error mce) {
			System.out.println("I am inside Catch block");
		}
	}

}
