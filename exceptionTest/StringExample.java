package exceptionTest;

public class StringExample {

	public static void main(String[] args) {
		String[] strings = {"Hi" , "Hello", "Good", "Morning"};
		
		for (int i = 0; i < 7; i++) {
			try {
				System.out.println("String is: " + strings[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("I do not have enough items in the Strings Array");
			}
			
		}
	}

}
