package Lab2.Models;
import Lab2.Interfaces.IAutopark;
import Lab2.Interfaces.ICar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Autopark implements IAutopark {
    private final List<ICar> cars;

    public Autopark(){

        this.cars = new ArrayList<>();
    }

    @Override
    public List<ICar> getCars() {
        return this.cars;
    }

    @Override
    public ICar getCarWithMinMileage() {
        return this.cars
                .stream()
                .min(Comparator.comparing(ICar::getCarMileage))
                .orElse(null);
    }
}
