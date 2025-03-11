package exceptionTest;


public class SimpleExceptionTest {

	public static void main(String[] args) {
		
		int[] nums = {2,4,5,0,6,0};
		
		for (int i = 0; i < nums.length; i++) {
			try {
				double result = 10/nums[i];
				System.out.println("Output is: " + result);
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
				System.out.println("Number cannot be divided by Zero");
			}
		}
	}

}
