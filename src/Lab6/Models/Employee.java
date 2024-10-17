package Lab6.Models;

import Lab6.Interfaces.IEmployee;

public class Employee implements IEmployee {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final double salary;
    private final String position;

    public Employee(String firstName,
                    String middleName,
                    String lastName,
                    double salary,
                    String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Name: %s %s %s Salary: %.2f Position: %s"
                .formatted(this.firstName,
                        this.middleName,
                        this.lastName,
                        this.salary,
                        this.position);
    }
}
