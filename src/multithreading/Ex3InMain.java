package multithreading;

public class Ex3InMain extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        Ex3InMain thread1 = new Ex3InMain();
        thread1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }



    }
}


