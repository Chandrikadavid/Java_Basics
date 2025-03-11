package OperatorsLesson;

public class TernaryOpsTest {
	/**
	 * Ternary Operators
	 * 
	 * condition boolean expression ? valueWhenExpressionTrue : valueWhenExpressionFalse
	 * 
	 */

	public static void main(String[] args) {

		// Check whether the student Passed or Failed in exam

		int passMarks = 50;
		int totalMarks = 100;
		int[] studentScore = { 40, 50, 88, 43, 56 };
		for (int i = 0; i < studentScore.length; i++) {
			boolean result = ((studentScore[i] <= totalMarks) && (studentScore[i] >= passMarks)) ? true : false;
			if (result == true) {
				System.out.println("Student is Passing with:" + studentScore[i] + " Marks");
			} else {
				System.out.println("Student is failed with:" + studentScore[i] + " Marks");
			}

		}

		// Ternary Operator Practices

		int a = 10;
		int b = 40;
		int c = 5;

		// Basic Ternary Expression
		int max = ((a > b) && (a > c)) ? a : b;
		System.out.println("Max Value is: " + max);

		// Ternary Expression with int and string
		String isEligible = (b > 30) ? "You are Eligible" : "You are not Eligible";
		System.out.println("Value of isEligible: " + isEligible);

		// Ternary assignment directly
		max = a == c ? 100 : a;
		System.out.println("Value of max: " + max);

		// Ternary boolean assignment
		boolean bool = (a > c) ? false : true;
		System.out.println("Value of boolean: " + bool);
	}

}
