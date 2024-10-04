package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Name: " + name +
                ", Age: " + age;
    }
}

public class ComparingEmployeeAge {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Joe Goldberg",34));
        employeeList.add(new Employee("Peter Parker",23));
        employeeList.add(new Employee("Tony Stark",55));
        employeeList.add(new Employee("Morgan",28));
        employeeList.add(new Employee("Davis",36));

        employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}
