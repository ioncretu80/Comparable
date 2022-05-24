package multithreading;

public class IntreruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();

        Thread.sleep(2000);

        //thread.stop();  invechit

        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {


        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("potok hotiat prerivati");
                System.out.println("Ubedilisi chto sostoianie vseh obiectov normalinoe i reshili zavershiti rabotu potoka");
                System.out.println(sqrtSum);
                return;

            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("potok hotiat prerivati vo vremia sna");
                System.out.println(sqrtSum);
                return;
            }
        }


    }


}
