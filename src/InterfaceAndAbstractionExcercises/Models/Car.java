package InterfaceAndAbstractionExcercises.Models;

import InterfaceAndAbstractionExcercises.Interfaces.Vehicles;

public class Car implements Vehicles {

    @Override
    public String changeGear(int gear) {
        return "Gear changed to %d car!".formatted(gear);
    }

    @Override
    public String speedUp(int speedUp) {
        return "Speed up limited by %d car!".formatted(speedUp);
    }

    @Override
    public String applyBrakes(int brakesPower) {
        return "Brakes apply by %d car!".formatted(brakesPower);
    }
}
