package Lab2.Interfaces;
import java.util.List;

public interface IAutopark {
    List<ICar> getCars();
    ICar getCarWithMinMileage();
}
