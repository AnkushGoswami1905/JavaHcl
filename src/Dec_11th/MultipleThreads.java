package Dec_11th;

class MyThreadClass implements Runnable {
    String threadName;
    Thread t1;

    public MyThreadClass(String threadName) {
        this.threadName = threadName;
        t1 = new Thread(this, threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(t1.getName() + " Loop " + (i + 1));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MyThreadClass mtc1 = new MyThreadClass("ChildThread1");
        MyThreadClass mtc2 = new MyThreadClass("ChildThread2");
        MyThreadClass mtc3 = new MyThreadClass("ChildThread3");

        mtc1.t1.start();
        mtc2.t1.start();
        mtc3.t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Loop " + (i + 1));
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
