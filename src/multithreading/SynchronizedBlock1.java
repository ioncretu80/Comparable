package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunableImp2 runable = new MyRunableImp2();
        Thread thread1 = new Thread(runable);
        Thread thread2 = new Thread(runable);
        Thread thread3 = new Thread(runable);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class Counter2 {
    volatile static int count = 0; // volatile nu ajuta
}

class MyRunableImp2 implements Runnable {

    private void doWork2() {
        System.out.println("Ura!");
    }


    private void doWork1() {
        doWork2();
        synchronized (this) {
//            System.out.println(Thread.currentThread());
            Counter2.count++;
            System.out.println(Counter2.count);


        }

    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }

    }
}
