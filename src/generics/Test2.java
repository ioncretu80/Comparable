package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        X x = new Y();
//
//        List<X> list1 = new ArrayList<X>();
//
//        //asa ceva nu lucreaza deoarece totalitatea Arrayist cu parametrul  X nu este tip a listei cu parametrul X
//        //  List<X> list2 = new ArrayList<Y>();

        List<Number> list = new ArrayList<>();
     //   List<Number> list1 = new ArrayList<Integer>();   //nu se poate de scris asa
    }
}


class X{}

class Y extends X{

}