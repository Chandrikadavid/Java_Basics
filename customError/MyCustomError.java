package customError;

public class MyCustomError {
	public static void main(String[] args) {

		try {
			createBiggestArray();
		} catch (OutOfMemoryError oome) {
			oome.printStackTrace();
			System.out.println("Do not use MAx_VALUE to create an array, use fixed array size");
		}

	}

	public static void createBiggestArray() {
		int[] biggestArray = new int[Integer.MAX_VALUE];

	}

}
