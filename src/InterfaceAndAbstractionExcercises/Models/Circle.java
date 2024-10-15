package InterfaceAndAbstractionExcercises.Models;

import InterfaceAndAbstractionExcercises.Interfaces.IShape;

public class Circle implements IShape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return 2 * 3.14 * this.radius;
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
