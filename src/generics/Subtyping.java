package generics;

public class Subtyping {
    public static void main(String[] args) {
        Info2<Integer> info1 = new Info2<>(18);
        System.out.println(info1);


//        Info2<Cat> info1 = new Info2<>(new Cat()); //nu merge deoarece classa Cat nu este subclas a Number


        Info2<Double> info11 = new Info2<>(3.14);
        System.out.println(info11);
        Double d1 = info11.getValue();
        System.out.println(d1);



    }
}




class Info2<T extends Number>{//crearea clasei cu un paremetru doar pentru clasele care se extind de la clasa Number
    private T value;

    public Info2(T value) {
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

class Cat {

}


interface I1{

}

interface I2{

}
