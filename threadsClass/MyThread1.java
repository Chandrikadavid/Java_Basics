package threadsClass;

public class MyThread1 {

	/**
	 * 
	 * Multi-threading in eclipse console
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new MyCustomRunnable("John's Print"));
		Thread th2 = new Thread(new MyCustomRunnable("Jame's Print"));
		
		th1.start();
		th2.start();
	}

}
