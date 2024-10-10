package Lab2;

import Lab2.Interfaces.IAutopark;
import Lab2.Interfaces.ICar;
import Lab2.Models.Autopark;
import Lab2.Models.Car;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAutopark autopark = new Autopark();

        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] carInfo = command
                    .split(" ");

            String brand = carInfo[0];
            String regNumber = carInfo[1];
            double mileage = Double.parseDouble(carInfo[2]);

            ICar car = new Car(brand,regNumber,mileage);

            autopark.getCars().add(car);
            command = scanner.nextLine();
        }

        System.out.println("Cars:");
        System.out.println();

        autopark
                .getCars()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Auto with low mileage if exist.");
        System.out.println();

        System.out.println(autopark.getCarWithMinMileage());
    }
}
