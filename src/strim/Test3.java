package strim;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(el
                ->{
            el *=2;
            System.out.println(el);
        });
        System.out.println("Medoda 2");
        Arrays.stream(array).forEach(el->System.out.println(el));

        System.out.println("Medoda reference");
        Arrays.stream(array).forEach(System.out::println);


        System.out.println("=============alata metoda===========");
        Arrays.stream(array).forEach(Utils::myMethod);
//sau se mai poate de scris
        Arrays.stream(array).forEach(elem->Utils.myMethod(elem));
    }

}


class Utils{
    public static void  myMethod(int a){
        a=a+5;
        System.out.println("Element = "+a);
    }
}
