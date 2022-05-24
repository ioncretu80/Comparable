package multithreading;

import java.sql.SQLOutput;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Zaur", lock);
        new Employee("Ivan", lock);
        new Employee("Alexander", lock);
        Thread.sleep(5000);
        new Employee("Petr", lock);
        new Employee("Oleg", lock);
        new Employee("Igor", lock);

    }

}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {

        if (lock.tryLock()) {

            try {
                // System.out.println(name + " jdet");
                // lock.lock();
                System.out.println(name + " polizuetsia bankomatom");
                Thread.sleep(2000);
                System.out.println(name + "  zaverschil svoi dela");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        } else {
            System.out.println(name + " ne hochet jdati v ocheredi");
        }


    }
}
