package Dec_10th;

public class MyThreadClass extends Thread {
	//Thread t1;
	public MyThreadClass() {
		super("Child Thread");
		System.out.println("Child Thread "+this);
		start();
	}
	public void run() {
		System.out.println("In the child Thread"+this);
		System.out.println("Executing child Thread");
		System.out.println("Exiting child Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In the main thread");
		MyThreadClass mtc = new  MyThreadClass();
		System.out.println("Exiting the main thread");

	}

}
