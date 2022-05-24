package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread start");

        UserThread userThread = new UserThread();
        userThread.setName("user_thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();


        System.out.println("Main thread end");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class DaemonThread extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "is daemon: " + isDaemon());
        for (int i = 1; i <= 100; i++) {
            try {
                sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

