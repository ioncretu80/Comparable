package multithreading;

public class Ex3ExtendThread {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();


    }
}


class MyThread3 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}


class MyThread4 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
