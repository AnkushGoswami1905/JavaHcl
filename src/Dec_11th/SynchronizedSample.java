package Dec_11th;
class Thread1{
	public void call() {
		System.out.println("Produce Goods....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consume Goods....");
	}
}
class MyThread extends Thread{
	Thread1 th1;
	public MyThread(Thread1 th1) {
		this.th1 = th1;
	}
	public void run(){
		synchronized(th1){
			th1.call();
		   
		}
	}
}
public class SynchronizedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		MyThread mt1 = new MyThread(th1);
		MyThread mt2 = new MyThread(th1);
		mt1.start();
		mt2.start();
	}

}
