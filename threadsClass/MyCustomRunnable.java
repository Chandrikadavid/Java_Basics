package threadsClass;

public class MyCustomRunnable implements Runnable {

	String threadName;

	public MyCustomRunnable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(i+ "."+ threadName + " is running_____" + i + "th time");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

}
