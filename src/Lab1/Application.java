package Lab1;
import Lab1.Iterfaces.IItem;
import Lab1.Iterfaces.IItemArray;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();


        IItemArray itemArray =
                new ItemArray();
        while (!command.equals("End")) {

            String[] infoForItemToSplit =
                    command.split(" ");

            String itemType = infoForItemToSplit[0];
            int itemQuantity = Integer.parseInt(infoForItemToSplit[1]);
            float itemPrice = Float.parseFloat(infoForItemToSplit[2]);
            int itemExpirationDays = Integer.parseInt(infoForItemToSplit[3]);

            IItem item = new Item(itemType,
                    itemQuantity,
                    itemPrice,
                    itemExpirationDays);

            itemArray.getItems().add(item);
            command = scanner.nextLine();
        }

        System.out.println("The Items:");

        System.out.println();

        itemArray.getItems().forEach(System.out::println);

        System.out.println();

        System.out.println("The averagePrice");
        System.out.printf("%.2f",itemArray.getCalculateAveragePrice());
    }
}
