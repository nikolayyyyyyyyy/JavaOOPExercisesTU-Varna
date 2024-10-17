package Lab6.Models;
import Lab6.Interfaces.IVehicle;

public abstract class Vehicle implements IVehicle {
    private final String number;
    private final double length;
    private final double width;

    protected Vehicle(String number,
                       double length,
                       double width){
        this.number = number;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("Class: ")
                .append(this.getClass().getSimpleName())
                .append("\n");
        stringBuilder
                .append("Number:")
                .append(this.number)
                .append("\n");
        stringBuilder
                .append("Length:")
                .append(this.length)
                .append("\n");
        stringBuilder
                .append("Width:")
                .append(this.width)
                .append("\n");
        return stringBuilder.toString().trim();
    }
}
