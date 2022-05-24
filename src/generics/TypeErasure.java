package generics;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {


    }

// //probleme de overload a metodelor
//    private void abc(Info1<String> info){
//        String s = info.getValue();
//    }
//
//    private void abc(Info1<Integer> info){
//        Integer i = info.getValue();//   }
// abc(Info1 info)

}


class Info1<T>{
    private T value;

    public Info1(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }


    public T getValue(){
        return value;
    }
}

class Parent{

    public void abc(Info1<String> info){
        String s = info.getValue();
    }

}
//Nu merge asa ceva
//class Child extends Parent{
//
//    public void abc(Info1<Integer> info){
//        Integer s = info.getValue();
//    }
//
//}

