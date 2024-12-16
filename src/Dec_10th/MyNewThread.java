package Dec_10th;

public class MyNewThread implements Runnable{
	Thread t1;
	public MyNewThread(){
		t1 = new Thread(this,"Child Thread");
		t1.start();//calls run method 
	}
    @Override
    public void run() {
    	System.out.println("Entering the child thread "+t1);
    	System.out.println("Inside child thread ");
    	System.out.println("Exiting child thread ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In the main thread");
		System.out.println("About to invoke the child thread");
		MyNewThread mnt = new MyNewThread();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished invoking child thread");
		System.out.println("Exiting Main");

	}

}
