package branchingStatements;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userPassword = null;
		do {
			System.out.print("Enter your password: ");
			userPassword = scanner.nextLine();
			System.out.println("Your Password is: " + userPassword);

		} while (userPassword.length() < 8);//iterates the loop till u didnt enter longer pswd 
		
		//if the correct length is entered loop get terminated and print the statement
		System.out.println("Password Accepted");

	}
}
