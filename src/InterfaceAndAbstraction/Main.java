package InterfaceAndAbstraction;
import InterfaceAndAbstraction.Interfaces.IClerk;
import InterfaceAndAbstraction.Interfaces.IEmployee;
import InterfaceAndAbstraction.Interfaces.IManager;
import InterfaceAndAbstraction.Models.Clerk;
import InterfaceAndAbstraction.Models.Manager;

public class Main {
    public static void main(String[] args) {

        IEmployee firstManager =
                new Manager("Nikolay",
                        "Nikolaev",
                        "9901288740",
                        "Smqdovo",
                        12000,
                        "Human Resources");

        IEmployee secondManager =
                new Manager("Ivan",
                        "Kalimarov",
                        "9012212344",
                        "Shumen",
                        5000,
                        "Human Resources");


        System.out.println("First manager info:");
        System.out.println(firstManager);
        System.out.println("Second manager info:");
        System.out.println(secondManager);

        System.out.println("First manager salary: " + firstManager.getSalary());
        System.out.println("Second manager salary: " + secondManager.getSalary());

        System.out.println("Earnings for 18 days:");

        IManager managerOne = (IManager) firstManager;
        IManager managerTwo = (IManager) secondManager;

        System.out.println("First manager:");
        System.out.println(managerOne.Earn(18, 100));

        System.out.println("Second manager:");
        System.out.println(managerTwo.Earn(18, 70));

        System.out.println("Earnings for full month:");

        System.out.println("First Manager:");
        System.out.println(managerOne.Earn(50));

        System.out.println("Second Manager:");
        System.out.println(managerTwo.Earn(20));

        IEmployee firstClerk = new Clerk("Nikolay",
                "Nikolaev",
                "9901288740",
                "Smqdovo",
                30000,
                "Human resource",
                30);

        IEmployee secondClerk = new Clerk("Ivan",
                "Kalimarov",
                "9012212344",
                "Shumen",
                5000,
                "Human Resources",
                12);

        IEmployee thirdClerk = new Clerk("Djenko",
                "Djenkov",
                "0001288740",
                "Shumen",
                300,
                "Human resource",
                1);

        IEmployee fourthClerk = new Clerk("Atanas",
                "Genchev",
                "9912212344",
                "Smqdovo",
                1200,
                "Human Resources",
                1);

        System.out.println(firstClerk + "\n");
        System.out.println(secondClerk + "\n");
        System.out.println(thirdClerk + "\n");
        System.out.println(fourthClerk + "\n");

        IEmployee[] clerks = new IEmployee[]{firstClerk, secondClerk, thirdClerk, fourthClerk};

        for(IEmployee clerk : clerks){
            System.out.println(clerk.getName()+":");
            System.out.println("Salary: " +clerk.getSalary() + "\n");
        }

        System.out.println("First clerk work experience:");
        IClerk first = (IClerk) firstClerk;
        System.out.println(first.totalWorkExperience());

        System.out.println("Second clerk work experience:");
        IClerk second = (IClerk) secondClerk;
        System.out.println(first.totalWorkExperience("2"));

        System.out.println("Third clerk work experience:");
        IClerk third = (IClerk) thirdClerk;
        System.out.println(first.totalWorkExperience(4));

        System.out.println("Total workers: " + firstClerk.getCountWorkers() + "\n");
        System.out.println("Firm: " + firstClerk.getFirmName());
    }
}