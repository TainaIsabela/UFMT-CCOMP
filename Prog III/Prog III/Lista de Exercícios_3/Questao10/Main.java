package Questao10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("João", "123456789", 10000);
        employees[1] = new Employee("Maria", "987654321", 20000);
        employees[2] = new Employee("Pedro", "123456789", 10000);

        Arrays.sort(employees, (e1, e2) -> {
            if (e1.getSalary() == e2.getSalary()) {
                return e1.getName().compareTo(e2.getName());
            }
            return e1.getSalary() - e2.getSalary();
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

