package InterfaceAndAbstractionExcercises.Models;

import InterfaceAndAbstractionExcercises.Interfaces.IShape;

public class Rectangle implements IShape {
    private final float width;
    private final float height;

    public Rectangle(float width,float height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateSurface() {
        return height * width;
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
