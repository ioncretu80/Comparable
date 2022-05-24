package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("NameOfMyThread5 :" + myThread5.getName()+ " Priority " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("NameOfMyThread6 :" + myThread6.getName()+ " Priority " + myThread6.getPriority());

        myThread5.setName("Moi Potok");
        myThread5.setPriority(9);

        myThread5.setPriority(Thread.MAX_PRIORITY);
        myThread5.setPriority(Thread.MIN_PRIORITY);
        myThread5.setPriority(Thread.NORM_PRIORITY);


        System.out.println("NameOfMyThread5 :" + myThread5.getName()+ " Priority " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread{

    @Override
    public void run() {
        System.out.println("privet");
    }
}
