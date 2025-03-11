package branchingStatements;

public class BranchingStatementsTest {

	public static void main(String[] args) {
		int num1 = -22;
		int num2 = 32;

		// if statements
		if ((num1 % 2) == 0) {
			System.out.println(num1 + " is even number");
		}

		
		
		// if-else statements

		if (num1 > 0) {
			System.out.println("You entered the positive number");
		} else if (num1 < 0) {
			System.out.println("You entered the negative number");
		} else {
			System.out.println("You entered zero");
		}

		
		
		// Switch Statements
		int operator = '+';
		switch (operator) {
		case '+':
			System.out.println("Add Result: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Sub Result: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Sub Result: " + (num1 * num2));
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}

		
		// Nested if statements
		int age = 10;
		boolean voterId = true;

		if (age >= 18) {
			if (voterId) {
				System.out.println("Eligible for voting");
			} else {
				System.out.println("Need VoterID");
			}
		} else {
			System.out.println("Not Eligible for voting");
		}

		
		// continue statement(skips that particular value and print everything)
		for (int i = 0; i <= 6; i++) {
			if (i == 3) {
				System.out.println("It skips the " + i + " as it has continue statement");
				continue;
			}
			System.out.println("The value of i is :" + i);

		}
		System.out.println("*****************");
		
		
		//break statement(stops the iteration after break)
		for (int i = 0; i <= 6; i++) {
			if (i == 3) {
				System.out.println("Break prints the values untill the "+ i);
				break;
			}
			System.out.println("The value of i is :" + i);

		}
		
	}

}
