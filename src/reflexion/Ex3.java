package reflexion;

import java.lang.reflect.Field;

public class Ex3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur", "IT");

        Class employeeClass = employee.getClass();

        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);

        double salary = (Double) field.get(employee);
        System.out.println(salary);

        field.set(employee, 1500);
        System.out.println(employee);

    }
}
