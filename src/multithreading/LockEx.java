package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class LockEx {

    public static void main(String[] args) {

        Call call = new Call();
        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        call.mobileCall();
                    }
                }
        );

        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        call.skypeCall();
                    }
                }
        );
        Thread thread3 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        call.whatsuppCall();
                    }
                }
        );


        thread1.start();
        thread2.start();
        thread3.start();


    }
}


class Call {
    private Lock look = new ReentrantLock();

    void mobileCall() {
        look.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            look.unlock();
        }
    }

    void skypeCall() {
        look.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            look.unlock();
        }
    }

    void whatsuppCall() {
        look.lock();
        try {
            System.out.println("Whatsupp call starts");
            Thread.sleep(7000);
            System.out.println("Whatsupp call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            look.unlock();
        }
    }
}