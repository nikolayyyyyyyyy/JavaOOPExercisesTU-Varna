package Lab6.Models;

public class Bus extends Vehicle{

    private final int countSittingSeats;

    protected Bus(String number,
                  double length,
                  double width,
                  int countSeats) {
        super(number, length, width);
        this.countSittingSeats = countSeats;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString())
                .append("\n")
                .append("Count Sitting Seats:")
                .append(this.countSittingSeats)
                .append("\n");

        return stringBuilder.toString();
    }
}
