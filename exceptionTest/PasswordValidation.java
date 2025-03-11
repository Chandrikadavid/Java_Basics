package exceptionTest;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Password:");
		String password = scanner.nextLine();
		System.out.println("Password is: " + password);

		password = null;

		try {
			System.out.println(password.length());
		} catch (Exception e) {
			password = "hi";
			System.out.println("Password is: " + password);
		} finally {
			scanner.close();
		}

	}

}
