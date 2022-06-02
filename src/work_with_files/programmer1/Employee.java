package work_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionUID = 2;
    String name;
    String surname;
    String deparment;
    int age;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department,
                    //int age,
                    double salary, Car car) {
        this.name = name;
        this.deparment = department;
        //  this.age = age;
        this.salary = salary;
        this.car = car;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + deparment + '\'' +
                //   ", age=" + age +
                ", salary=" + salary +
                ", car= " + car +
                '}';
    }
}
