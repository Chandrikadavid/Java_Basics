package exceptionTest;

public class MultipleCatchTest {

	public static void main(String[] args) {

		tryFinally();
		tryCatchPractice();
	}
	
	public static void tryFinally() {
		try {
			int i = 10/0;
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

	public static void tryCatchPractice() {
		try {
			int[] arr = new int[2];
			System.out.println("Give me number 0th " + arr[1]);

			String str = "HELLO";
			System.out.println("Size of String is:" + str.length());

			int result = 10 / 2;
			System.out.println("Print result: " + result);

			int[] negativeArr = new int[1];

		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException is caught");
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("ArrayIndexOutOfBoundsException is caught");
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException is caught");
		} catch (NegativeArraySizeException nase) {
			System.out.println("NegativeArraySizeException is caught");
			nase.printStackTrace();
		}

	}
}
