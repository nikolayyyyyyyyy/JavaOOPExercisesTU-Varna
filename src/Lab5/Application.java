package Lab5;
import Lab5.Interfaces.ISoftDrinkShelf;
import Lab5.Models.SoftDrink;
import Lab5.Models.SoftDrinkShelf;

public class Application {
    public static void main(String[] args) {
        ISoftDrinkShelf shelf = new SoftDrinkShelf();

        shelf.getDrinks().add(new SoftDrink("Coca-Cola", "2025-12-31", 0.5, 10));
        shelf.getDrinks().add(new SoftDrink("Fanta", "2025-10-31", 0.5, 9));
        shelf.getDrinks().add(new SoftDrink("Coca-Cola", "2025-12-31", 1.0, 10));
        shelf.getDrinks().add(new SoftDrink("Sprite", "2025-11-30", 0.5, 8));
        shelf.getDrinks().add(new SoftDrink("Fanta", "2025-10-31", 1.5, 9));
        shelf.getDrinks().add(new SoftDrink("Coca-Cola", "2025-12-31", 0.33, 10));

        String mostFrequentDrink = shelf.getMostFrequentSoftDrink();

        System.out.println(mostFrequentDrink);
    }
}
