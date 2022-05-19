package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    //Metoda1
//    public Car(String color, int doorCount, int horsePower
//    ) {
//        this.color = color;
//        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
//    }

    //Metoda2
    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;

    }

    public void setEngine(Engine engine){
        this.engine = engine;

    }


    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public  class Engine{
        int horsPower;

        public Engine(int horsPwer) {
            this.horsPower = horsPwer;
        }


        @Override
        public String toString() {
            return "My Engine{" +
                    "horsPower=" + horsPower +
                    '}';
        }
    }


}


class Test{
    public static void main(String[] args) {

        //creare class Engine

//        Car car = new Car("black", 4, 300);
//        System.out.println(car);

        Car car = new Car("black", 4);
        System.out.println(car);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        // merge dar nu se recomanda
        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);





    }
}
