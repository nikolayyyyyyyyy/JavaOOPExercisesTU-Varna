package Lab6.Models;

public class Truck extends Vehicle{
    private final double weight;

    protected Truck(String number,
                    double length,
                    double width,
                    double weight) {
        super(number, length, width);
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append(super.toString())
                .append("\n")
                .append("Weight: ")
                .append(this.weight);

        return stringBuilder.toString();
    }
}
