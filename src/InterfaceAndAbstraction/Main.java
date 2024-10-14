package InterfaceAndAbstraction;
import InterfaceAndAbstraction.Interfaces.IEmployee;
import InterfaceAndAbstraction.Interfaces.IManager;
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


        System.out.println(firstManager);
        System.out.println(secondManager);

        System.out.println("First manager salary: " + firstManager.getSalary());
        System.out.println("Second manager salary: " + secondManager.getSalary());

        System.out.println("Earnings for 18 days:");

        IManager managerOne = (IManager) firstManager;
        IManager managerTwo = (IManager) secondManager;

        System.out.println("First manager:");
        System.out.println(managerOne.Earn(18,100));

        System.out.println("Second manager:");
        System.out.println(managerTwo.Earn(18,70));

        System.out.println("Earnings for full month:");

        System.out.println("First Manager:");
        System.out.println(managerOne.Earn(50));

        System.out.println("Second Manager:");
        System.out.println(managerTwo.Earn(20));
    }
}