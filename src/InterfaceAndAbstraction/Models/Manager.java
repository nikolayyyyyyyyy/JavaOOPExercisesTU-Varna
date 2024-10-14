package InterfaceAndAbstraction.Models;

import InterfaceAndAbstraction.Interfaces.IManager;

public class Manager extends Employee implements IManager {

    private String sector;

    public Manager(String name,
                   String family,
                   String egn,
                   String town,
                   float salary,
                   String sector) {
        super(name, family, egn, town, salary);
        setSector(sector);
    }

    public String getSector(){
        return this.sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
        + "Sector: " + this.sector;
    }

    @Override
    public double Earn(int countWorkDays, float earningPerDay) {
        return (float)countWorkDays * earningPerDay;
    }

    @Override
    public float Earn(float earningPerDay) {
        return earningPerDay * 22;
    }
}