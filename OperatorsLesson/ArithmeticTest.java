package OperatorsLesson;

public class ArithmeticTest {

	public static void main(String[] args) {

		// +, -, *, /, %
		int sum = addTest(23, 77);
		System.out.println(sum);

		int sub = subtractTest(10, 70);
		System.out.println(sub);

		int product = productTest(5, 6);
		System.out.println(product);

		float division = divisionTest(578, 4.6f);
		System.out.println(division);

		int modulus = modulusTest(578, 8);
		System.out.println(modulus);

		// other way to call the method without using new variable
		// System.out.println(modulusTest(578, 6));
	}

	// Addition
	public static int addTest(int a, int b) {
		System.out.print("Addition of " + a + " and " + b + " is: ");
		return a + b;
	}

	// Subtraction
	public static int subtractTest(int a, int b) {
		System.out.print("Sustraction of " + a + " and " + b + " is: ");
		return a - b;
	}

	// Multiplication
	public static int productTest(int a, int b) {
		System.out.print("Multiplication of " + a + " and " + b + " is: ");
		return a * b;
	}

	// Division-----Gives the Quotient
	public static float divisionTest(int a, float b) {
		System.out.print("Division of " + a + " and " + b + " is: ");
		if (b != 0) {
			return a / b;
		}
		return 0;

	}

	// Modulus----Gives the remainder
	public static int modulusTest(int a, int b) {
		System.out.print("Modulus of " + a + " and " + b + " is: ");
		if (b != 0) {
			return a % b;
		}
		return 0;
	}
}
