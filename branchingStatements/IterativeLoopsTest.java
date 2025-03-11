package branchingStatements;

import java.util.Scanner;

public class IterativeLoopsTest {

	/**
	 * 
	 * For Loop
	 * initialize; condition; iteration
	 * statements
	 * 
	 * while loop
	 * run until condition is true
	 * while(condition)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		int a = 5;
//		String[] string = {"Hello","Good", "Morning", "everyone" };

//		for (int i = 0; i < a; i++) {
//			System.out.println("This is the loop for index " + i);
//		}
//
//		for (String greetings : string) { // iterates whole array as there is no condition
//			System.out.println("I say: " + greetings);
//		}
//
//		for (int i = 0; i <= 3; i++) {
//			// String greet = string[i];
//			System.out.println("I say: " + string[i]);
//		}
		
		int i=1;
		while(i<=4) {
			System.out.println("Inside the while loop "+i );
			if(i==3) {
				System.out.println("Break the while loop");
				break;
			}
			i++;
		}

		
		int j=1;
		do {
			System.out.println("Inside the Do While Loop "+ j);
			j++;
		}while(j<5);
	}


}
