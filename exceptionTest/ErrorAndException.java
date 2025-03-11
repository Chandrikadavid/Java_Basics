package exceptionTest;

public class ErrorAndException {

	public static void main(String[] args) {

		int a = 10;

		try {
			int result = a / 0;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("ArithmeticException handled:Number cannot be divided by zero");
		}
		System.out.println("**************************************************************************");
//
//		try {
//			createBiggestArray();
//		} catch (OutOfMemoryError oome) {
//			oome.printStackTrace();
//			System.out.println("Do not use MAx_VALUE to create an array, use fixed array size");
//		}
		createBiggestArray();
	}

	public static void createBiggestArray() {
		try {
			int[] biggestArray = new int[Integer.MAX_VALUE];
		}
		catch(OutOfMemoryError oome) {
				oome.printStackTrace();
				System.out.println("Do not use MAx_VALUE to create an array, use fixed array size");

		}
	}

}
