package strim;

import javax.sound.midi.Soundbank;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6Chaining {
    public static void main(String[] args) {

        Stream<Integer> stream1 =Stream.of(1,2,3,4,5,1,2,3);


//        stream1.filter(el->
//        {
//            System.out.println("!!!");
//            return el%2==0;
//        }).collect(Collectors.toList());

        System.out.println(stream1.distinct().peek(System.out::println).count());

    }
}
