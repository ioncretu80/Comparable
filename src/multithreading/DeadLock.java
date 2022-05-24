package multithreading;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();

    }

}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: Popatka zahvatiti monitor obiekta lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Thread10: monitor objecta lock1 zahvachen");

            System.out.println("Thread10: Popatka zahvatiti monitor obiekta lock2");
            synchronized (DeadLock.lock2) {
                System.out.println("Thread10: monitori objecta lock1 i lock2 zahvachen");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: Popatka zahvatiti monitor obiekta lock2");
        synchronized (DeadLock.lock2) {
            System.out.println("Thread20: monitor objecta lock2 zahvachen");

            System.out.println("Thread20: Popatka zahvatiti monitor obiekta lock1");
            synchronized (DeadLock.lock1) {
                System.out.println("Thread20: monitori objecta lock1 i lock2 zahvachen");
            }
        }
    }
}
