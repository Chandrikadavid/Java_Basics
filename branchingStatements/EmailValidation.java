package branchingStatements;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
//		String[] emails = { "john@example.com", 
//				"john.com",
//				"john_example@.com", 
//				"John@" };
//		
//		int i = 0; 
//        do {
//        	
//            if (emails[i].contains(".com") && emails[i].contains("@")) {
//                System.out.println(emails[i] + " is a Valid Email");
//            } else {
//                System.out.println(emails[i] + " is an Invalid Email");
//            }
//
//            i++;
//        } while (i < emails.length); 

		Scanner scanner = new Scanner(System.in);
		String userEmail = null;
		int i =0;
		do {
			System.out.println("Enter Email: ");
			userEmail = scanner.nextLine();
			if (userEmail.contains(".com") && userEmail.contains("@")) {
	               System.out.println(userEmail + " is a Valid Email");
	           } else {
	               System.out.println(userEmail + " is an Invalid Email");
	           }
			i++;
			}while(i< userEmail.length());
		}
			 
		
	}
