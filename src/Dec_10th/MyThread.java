package Dec_10th;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = Thread.currentThread();
        System.out.println("Current Thread "+myThread);
        myThread.setName("New thread");
        System.out.println("Current Thread "+myThread);
        
	}

}
