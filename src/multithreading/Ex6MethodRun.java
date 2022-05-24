package multithreading;

public class Ex6MethodRun implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6MethodRun());
        thread.start();
        System.out.println("Method run.Thread name = " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("Method run.Thread name = " + Thread.currentThread().getName());
    }
}
