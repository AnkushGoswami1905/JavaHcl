package Dec_11th;

class DataBuffer {
    int d;
    boolean flag = false;

    synchronized int getData() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        System.out.println("Consumer got data: " + d);
        flag = false;
        notify();
        return d;
    }

    synchronized void putData(int d) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        this.d = d;
        System.out.println("Producer put data: " + d);
        flag = true;
        notify();
    }
}

class Producer implements Runnable {
    DataBuffer t;

    public Producer(DataBuffer t) {
        this.t = t;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int data = 0;
        while (true) {
            data = data + 1;
            t.putData(data);
            try {
                Thread.sleep(500); // Simulate some processing delay
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    DataBuffer t;

    public Consumer(DataBuffer t) {
        this.t = t;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            t.getData();
            try {
                Thread.sleep(1000); // Simulate some processing delay
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class InterThreadCom {
    public static void main(String[] args) {
        DataBuffer obj1 = new DataBuffer();
        Producer p = new Producer(obj1);
        Consumer c = new Consumer(obj1);
    }
}
