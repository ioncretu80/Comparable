package anotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {


    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//@Target(ElementType.METHOD)  // pentru methode
@Target({ElementType.TYPE, ElementType.METHOD}) // Pentru metode si clase
@Retention()
@interface MyAnnotation {

}