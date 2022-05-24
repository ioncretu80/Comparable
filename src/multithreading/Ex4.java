package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println("privet");
            }
        }).start();



        new Thread(()-> {
            System.out.println(Thread.currentThread());
            System.out.println("privet2");
        }).start();


    }
}
