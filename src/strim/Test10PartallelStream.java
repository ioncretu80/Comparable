package strim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test10PartallelStream {


    // 1 2 3 4 ....  1 000 000 000
      // 1 ... 250 000 000
      //250 000 001 ... 500 000 0000
      //500 000 001 ... 750 000 0000

    public static void main(String[] args) {

        List<Double>  list = new ArrayList<>();

        Random r = new Random();

//        for (int i = 0; i < 50000000; i++) {
//            list.add(r.nextDouble());
//        }

        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        long m = System.currentTimeMillis();
        System.out.println(m);
        double division = list.stream().reduce((acum, element) -> acum/element).get();
        System.out.println(division);
        System.out.println(System.currentTimeMillis() - m);


        long m1 = System.currentTimeMillis();
        System.out.println(m1);

        double division2 = list.parallelStream().reduce((acum, element) -> acum/element).get();
        System.out.println(division2);
        System.out.println(System.currentTimeMillis() - m1);

    }

}
