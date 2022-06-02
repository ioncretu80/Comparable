package reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("reflexion.Employee");

        //vechi
        Employee o1 = (Employee) employeeClass.newInstance();

        //nou


        Constructor<Employee> constructor1 = employeeClass.getConstructor();

        Employee obj1 = constructor1.newInstance();
        System.out.println(obj1);

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(20, "Ion", "IT");
        System.out.println(obj2);

        Method setSalaryMethod = employeeClass.getMethod("setSalary", double.class);

        setSalaryMethod.invoke(obj2, 800.88);
        System.out.println(obj2);


    }
}
