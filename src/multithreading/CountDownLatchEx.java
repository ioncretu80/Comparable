package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }

    private static void evrithingIsRedy() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Evrything is redy, so lets open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opend");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);
        marketStaffIsOnPlace();
        evrithingIsRedy();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {

        try {
            countDownLatch.await();
            System.out.println(name + " pristupil k zakupkam");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


