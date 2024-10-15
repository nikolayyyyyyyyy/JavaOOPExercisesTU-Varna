package InterfaceAndAbstractionExcercises.Models;
import InterfaceAndAbstractionExcercises.Interfaces.IShape;

public class Triangle implements IShape {
    private final float width;
    private final float height;

    public Triangle(float width,
                    float height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateSurface() {
        return (width * height) / 2;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "%s: Surface: %.2f".formatted(getName(),calculateSurface());
    }
}
