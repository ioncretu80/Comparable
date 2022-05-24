package multithreading;

public class Ex12 {

    static final Object lock = new Object();

    void mobileCallMethod() {

        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }


    synchronized void skypeCallMethod() {

        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }

    }

    synchronized void whatsupCallMethod() {

        synchronized (lock) {

            System.out.println("Whatsup call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsup call ends");
        }

    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunableImplMobile());
        Thread thread2 = new Thread(new RunableImplSkype());
        Thread thread3 = new Thread(new RunableImplWhatsup());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunableImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCallMethod();

    }
}

class RunableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCallMethod();

    }
}


class RunableImplWhatsup implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsupCallMethod();

    }
}