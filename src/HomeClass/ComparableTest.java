package HomeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, 12345, "Ray", "Kamal");
        Employee emp2 = new Employee(15, 55789, "Dubov", "Ram");
        Employee emp3 = new Employee(123, 73567, "Basu", "Doran");
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("До сортировки \n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("После сортировки \n" + list);
    }
}
class Employee implements Comparable<Employee> {
        int id;
        String name;
        String sourName;
        int salary;

     public Employee(int id, int salary, String sourName, String name) {
         this.id = id;
         this.salary = salary;
         this.sourName = sourName;
         this.name = name;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", sourName='" + sourName + '\'' +
                 ", salary=" + salary +
                 '}';
     }

     // Задаем свой собственный вариант сортировки
     // - в классе имплементировать интерфейс Comparable
     // - переопределить его метод compareTo
        @Override
        public int compareTo(Employee anotherEmp) {
            if (this.id == anotherEmp.id){
                return 0;
            }else {
                if (this.id < anotherEmp.id){
                    return -1;
                }else {
                    return 1;
                }
            }
//            return this.name.compareTo(anotherEmp.name);
        }
}
class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id){
            return 0;
        }else if (emp1.id < emp2.id){
            return -1;
        }else {
            return 1;
        }
    }
}
class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}