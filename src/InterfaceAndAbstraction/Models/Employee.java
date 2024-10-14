package InterfaceAndAbstraction.Models;

import InterfaceAndAbstraction.Interfaces.IEmployee;

public abstract class Employee implements IEmployee {

    private final static String workPlace = "DHL";
    private static int allWorkersCount;
    protected String name;
    protected String family;
    private String egn;
    protected String town;
    private float salary;

    public Employee(String name,
                    String family,
                    String egn,
                    String town,
                    float salary) {
        allWorkersCount++;
        setName(name);
        setFamily(family);
        setEGN(egn);
        setTown(town);
        setSalary(salary);
    }

    @Override
    public String toString() {

        return "Work Place: " + workPlace + "\n" +
                "All Workers: " + allWorkersCount + "\n" +
                "Name: " + this.name + " Family: " + this.family + "\n" +
                "EGN: " + this.egn + " Town: " + this.town + "\n" +
                "Salary: " + this.salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFamily() {
        return this.family;
    }

    @Override
    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String getEGN() {
        return this.egn;
    }

    @Override
    public void setEGN(String egn) {
        this.egn = egn;
    }

    @Override
    public String getTown() {
        return this.town;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
