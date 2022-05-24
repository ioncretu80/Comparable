package multithreading;

public class Ex10 {

    public static void main(String[] args) {
        MyRunableImp1 runableImp1 = new MyRunableImp1();
        Thread thread1 = new Thread(runableImp1);
        Thread thread2 = new Thread(runableImp1);
        Thread thread3 = new Thread(runableImp1);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class Counter {
    volatile static int count = 0; // volatile nu ajuta
}

class MyRunableImp1 implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }

    }
}
