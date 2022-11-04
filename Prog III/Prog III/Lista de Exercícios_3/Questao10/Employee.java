package Questao10;

public class Employee implements Comparable<Employee> {
    private String name;
    private String cpf;
    private Integer salary;

    public Employee(String name, String cpf, Integer salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.getSalary());
    }
}