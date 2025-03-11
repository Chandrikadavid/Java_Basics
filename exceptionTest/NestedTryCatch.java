package exceptionTest;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {
			int[] arr = new int[6];

			try {
				arr[5] = 10;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException caught");
			}

			String str = null;
			try {
				System.out.println(str.length());
			} catch (NullPointerException e) {
				System.out.println("NullPointerException caught");
			}

		} catch (Exception e) {

		} finally {
			System.out.println("Finally block executed");
		}
	}

}
