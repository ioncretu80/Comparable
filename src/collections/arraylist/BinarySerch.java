package collections.arraylist;

import java.util.*;

public class BinarySerch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

//        int index1 = Collections.binarySearch(arrayList,100);
//        System.out.println(index1);
//
//
//
//        Employee emp1 = new Employee(100, "Zaur", 1235);
//        Employee emp2 = new Employee(15, "Ivan", 654);
//        Employee emp3 = new Employee(123, "Petr", 584);
//        Employee emp4 = new Employee(15, "Mariya", 3254);
//        Employee emp5 = new Employee(182, "Kolya", 7852);
//        Employee emp6 = new Employee(15, "Sasha", 9514);
//        Employee emp7 = new Employee(250, "Elena", 1258);
//
//
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//
//        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 7852));
//        System.out.println(index2);
//


//        int[] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
//
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        int index1 = Arrays.binarySearch(array,150);
//        System.out.println(index1);





    }
}


class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {

        int result = this.id-another.id;

        if (result == 0){
            result = this.name.compareTo(another.name);
        }

        return result;
    }
}
