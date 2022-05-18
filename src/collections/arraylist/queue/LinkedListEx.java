package collections.arraylist.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>();


        //add()
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Marya");
        queue.add("Alexandr");

//        //offer() nu arunca exceptie
//        queue.offer("Zaur");
//        queue.offer("Oleg");
//        queue.offer("Ivan");
//        queue.offer("Marya");
//        queue.offer("Alexandr");


        //remove - arunca exceptie
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        //poll() - sterge dar exceptie nu arunca ci valoarea null

        System.out.println(queue.poll());
        System.out.println(queue);


        //element() - arata elementul care sta in rand
        System.out.println(queue.element());
        //peek() - nu arunca excepti ci intoarce null
        System.out.println(queue.peek());


        queue.remove ("ivan");










    }
}
