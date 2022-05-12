package comparation.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>() ;
        list.add("Zaur");
        list.add("Ion");
        list.add("Petru");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Employee> emp_list = new ArrayList<>();
        Employee emp2 = new Employee(15, "Petru", "Galca", 1658);
        Employee emp3 = new Employee(100, "Ion", "Perju", 1898);
        Employee emp1 = new Employee(1, "Ion", "Cretu", 1544);

        emp_list.add(emp2);
        emp_list.add(emp1);
        emp_list.add(emp3);


        for (Employee element:emp_list ) {

            //System.out.println(element.id);
            System.out.println(element.toString());

        }
        System.out.println();

        Collections.sort(emp_list);

        for (Employee element:emp_list ) {

           // System.out.println(element.id);
            System.out.println(element.toString());

        }


    }
}

class Employee implements Comparable<Employee>{
    int id, salary;
    String name, surname;

    public Employee(int id,  String name, String surname, int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public int compareTo(Employee employee) {

//        //Metoda1
//        if (this.id == employee.id){
//            return 0;
//        } else if (this.id< employee.id) {
//            return -1;
//        } else
//        {
//            return 1;
//        }



        // //Metoda 2
        // return this.id- employee.id; //comparare dupa id
        // //Metoda 3
        // return this.id.compareTo(employee.id); //comparare dupa id cand Id Integer

       //Metoda 4

        int res = this.name.compareTo(employee.name);

        if(res == 0){
            return this.surname.compareTo(employee.surname);
        }

        return res;


        // rezultat fals
//        return this.name.compareTo(employee.name)==0 ? this.surname.compareTo(employee.surname): this.name.compareTo(employee.name) ; //comparare dupa name
    }


    @Override
    public String toString() {
        return "comparation.comparable.Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}