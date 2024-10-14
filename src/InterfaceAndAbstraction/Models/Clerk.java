package InterfaceAndAbstraction.Models;
import InterfaceAndAbstraction.Interfaces.IClerk;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Clerk extends Employee implements IClerk {
    private String sector;
    private float bonus;

    public Clerk(String name,
                 String family,
                 String egn,
                 String town,
                 float salary,
                 String sector,
                 float bonus) {
        super(name, family, egn, town, salary);
        setSector(sector);
    }

    public String getSector(){
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Sector: " + this.sector + "\n"
                + "Percent: " + this.bonus;
    }

    @Override
    public float getSalary() {
        return super.getSalary() * this.bonus;
    }

    @Override
    public int totalWorkExperience() {
        List<String> egn = Arrays.stream(this.getEGN()
                .split("")).toList();

        String year = egn.get(0) + egn.get(1);
        int currentYear = LocalDate.now().getYear();

        if(Integer.parseInt(year) <= 99) {
            int yearOfBeginWorking =
                    Integer.parseInt("19" + year)
                            + 23;

            return currentYear - yearOfBeginWorking;
        } else {
            int beginOfWorking = Integer
                    .parseInt("20"+ year)
                    + 23;

            return currentYear - beginOfWorking;
        }
    }

    @Override
    public int totalWorkExperience(String string) {
        return this.totalWorkExperience() - Integer.parseInt(string);
    }

    @Override
    public int totalWorkExperience(int d) {
        return this.totalWorkExperience() - d;
    }
}
