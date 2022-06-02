package reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //Methoda1
        Class employeeClass = Class.forName("reflexion.Employee");
        //Methoda2
        Class employeeClass2 = Employee.class;

        //Methoda3
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();


        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field: " + someField.getType());
        Field[] fields = employeeClass.getFields();
        System.out.println("***************************************");
        for (Field field : fields
        ) {
            System.out.println("Name " + field.getName() + ", Typ " + field.getType());
        }

        System.out.println("***************************************");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields
        ) {
            System.out.println("Name " + field.getName() + ", Typ " + field.getType());
        }


        //Metode
        System.out.println("***************************************");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return typ of Method increaseSalary = " + someMethod1.getReturnType() + ", Parameter types =  " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("Return typ of Method increaseSalary = " + someMethod2.getReturnType() + ", Parameter types =  " + Arrays.toString(someMethod2.getParameterTypes()));

        Method[] methods = employeeClass.getMethods();
        System.out.println("***************************************");

        for (Method method : methods
        ) {
            System.out.println("Name of Method = " + method.getName() + ", Return Type" + method.getReturnType() + ", Parametrs: " + Arrays.toString(method.getParameters()));
        }


        Method[] allMethods = employeeClass.getDeclaredMethods();
        System.out.println("*************All Methods**************************");

        for (Method method : allMethods
        ) {
            System.out.println("Name of Method = " + method.getName() + ", Return Type" + method.getReturnType() + ", Parametrs: " + Arrays.toString(method.getParameters()));
        }


        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        System.out.println("*************All Methods public**************************");

        for (Method method : allMethods
        ) {
            if (Modifier.isPublic(method.getModifiers())) {

                System.out.println("Name of Method = " + method.getName() + ", Return Type" + method.getReturnType() + ", Parametrs: " + Arrays.toString(method.getParameters()));
            }
        }


        System.out.println("*************Constructor Info**************************");
        Constructor constructor1 = employeeClass.getConstructor();

        System.out.println("constructor has " + constructor1.getParameterCount() + " parameters");
        System.out.println("Their Types " + Arrays.toString(constructor1.getParameterTypes()));

        Constructor[] constructors = employeeClass.getConstructors();
        System.out.println("*************All Constructors Info**************************");
        for (Constructor constructor : constructors
        ) {

            System.out.println("Constructor Name:  " + constructor.getName());
            System.out.println("Constructor Parameterscount:  " + constructor.getParameterCount());
            System.out.println("Constructor Parameters: " + Arrays.toString(constructor.getParameters()));

        }


    }
}
