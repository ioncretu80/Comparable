package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        // ExecutorService executorService = new ThreadPoolExecutor();


//        ExecutorService executorService = Executors.newFixedThreadPool(5); //creare cu ajutorul methodei
        ExecutorService executorService = Executors.newSingleThreadExecutor(); //creare cu ajutorul methodei


        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunableImp100());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");

    }
}

class RunableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " ends work");


    }
}
