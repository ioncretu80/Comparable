package nested_classes.static_nested_clas;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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


    public static class Engine{
        int horsPower;

        public Engine(int horsPwer) {
            this.horsPower = horsPwer;
        }


        @Override
        public String toString() {
            return "My Engine{" +
                    "horsPwer=" + horsPower +
                    '}';
        }
    }


}


class Test{
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2 ,engine);
        System.out.println(car);
    }
}
