package Dec_10th;

public class ThreadSamples implements Runnable {
	
	Thread t1;
	
	// Constructor
	public ThreadSamples() {
	}

	@Override
	public void run() {
		// Logic for the thread's execution
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread loop " + (i + 1));
			try {
				// Sleep for 1 second (1000 milliseconds)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread starting...");
		
		// Sleep after "Main thread starting..."
		try {
			// Sleep for 2 seconds (2000 milliseconds)
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted after starting...");
		}

		// Create an instance of ThreadSamples (Runnable) and attach it to a Thread
		ThreadSamples ts = new ThreadSamples();
		Thread t1 = new Thread(ts);
		
		// Start the child thread
		t1.start();
		
		// Loop for the main thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread loop " + (i + 1));
			try {
				// Sleep for 500 milliseconds (0.5 seconds)
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted during loop...");
			}
		}
		
		System.out.println("Main thread ending...");
	}
}
