package multithreading;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();
    }







}


class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}


class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }
}
