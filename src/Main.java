import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Employee1", 25, 1500);
        Employee employee2 = new Employee(2, "Employee2", 28, 2000);
        Employee employee3 = new Employee(3, "Employee3", 30, 2500);
        Employee employee4 = new Employee(4, "Employee4", 23, 1500);
        Employee employee5 = new Employee(5, "Employee5", 25, 1800);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("Comparable:\n" + employees);

        employees.sort(Employee.salaryComparator
                .thenComparing(Employee.ageComparator
                        .thenComparing(Employee.nameComparator
                                .thenComparing(Employee.idComparator))));
        System.out.println("Comparator:\n" + employees);

    }
}