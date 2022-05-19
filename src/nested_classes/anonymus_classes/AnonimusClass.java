package nested_classes.anonymus_classes;

public class AnonimusClass {
    public static void main(String[] args) {


        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };

        System.out.println(m.doOperation(3,5));


        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m2.doOperation(3,5));


    }
}

interface Math{
    int doOperation(int a, int b);
}