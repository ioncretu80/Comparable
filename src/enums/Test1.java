package enums;

public class Test1 {
    void method(String dayOfWeek) {
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 enum1 = new Test1();
        enum1.method("Monday");


    }
}


