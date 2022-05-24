package multithreading;

public class WaitNotifyEx {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread th1 = new Thread(producer);
        Thread th2 = new Thread(consumer);
        th1.start();
        th2.start();

    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount--;
        System.out.println("potrebiteli kupil odin hleb");
        System.out.println("Kolichestvo hleba v magazine  = " + breadCount);
        notify();
    }


    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount++;
        System.out.println("Proizvoditeli dobavil na vitrinu odin hleb");
        System.out.println("Kolichestvo hleba v magazine  = " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}