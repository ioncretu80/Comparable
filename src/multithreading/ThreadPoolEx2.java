package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunableImp200());
//        }

//        scheduledExecutorService.schedule(new RunableImp200(),3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

        // scheduledExecutorService.scheduleAtFixedRate(new RunableImp200(), 3, 1, TimeUnit.SECONDS);


        scheduledExecutorService.scheduleWithFixedDelay(new RunableImp200(), 3, 2, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();


    }
}

class RunableImp200 implements Runnable {
    static int count = 0;

    @Override
    public void run() {
        count++;
        System.out.println(Thread.currentThread().getName() + " begins work " + count);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " ends work");


    }
}
