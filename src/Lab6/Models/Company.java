package Lab6.Models;
import Lab6.Interfaces.ICompany;
import Lab6.Interfaces.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class Company implements ICompany {

    private final String name;
    private final List<IEmployee> employees;

    public Company(String name,List<IEmployee> employees){
        this.name = name;
        this.employees = employees;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInformation() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("Company: ")
                .append(this.name)
                .append("\n");

        stringBuilder
                .append("Employees: ")
                .append("\n");
        for(IEmployee employee : employees) {

            stringBuilder.append(employee)
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public List<IEmployee> getEmployees(String employeeName) {
        return this.
                employees
                .stream()
                .filter(e -> e.getFirstName()
                        .concat(" ")
                        .concat(e.getMiddleName())
                        .concat(" ")
                        .concat(e.getLastName()).equals(employeeName)).toList();
    }
}
