package Lab6.Models;

import Lab6.Interfaces.IVehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private final List<IVehicle> vehicles;

    public Parking(String input){
        this.vehicles = new ArrayList<>(1000);
        setVehicles(input);
    }
    private void setVehicles(String input){
        String[] arguments =
                input.split(";");

        for(String info : arguments) {

            String[] objInfo = info.split(":");

            switch (objInfo[0]){

                case "Car":
                    String[] carInfo = objInfo[1]
                            .split(",");
                    String carNumber = carInfo[0];
                    double carLength = Double.parseDouble(carInfo[1]);
                    double carWidth = Double.parseDouble(carInfo[2]);

                    IVehicle car = new Auto(carNumber,carLength,carWidth);
                    vehicles.add(car);
                    break;
                case "Truck":
                    String[] truckInfo = objInfo[1]
                            .split(",");
                    String truckNumber = truckInfo[0];
                    double truckLength = Double.parseDouble(truckInfo[1]);
                    double truckWidth = Double.parseDouble(truckInfo[2]);
                    double truckWeight = Double.parseDouble(truckInfo[3]);
                    IVehicle truck = new Truck(truckNumber,
                            truckLength,
                            truckWidth,
                            truckWeight);

                    vehicles.add(truck);
                    break;
                case"Bus":
                    String[] BusInfo = objInfo[1]
                            .split(",");
                    String busNumber = BusInfo[0];
                    double busLength = Double.parseDouble(BusInfo[1]);
                    double busWidth = Double.parseDouble(BusInfo[2]);
                    int busSeatsCount = Integer.parseInt(BusInfo[3]);
                    IVehicle bus = new Bus(busNumber,
                            busLength,
                            busWidth,
                            busSeatsCount);

                    vehicles.add(bus);
                    break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Parking:").append("\n");

        for (IVehicle vehicle : vehicles) {

            stringBuilder.append(vehicle).append("\n");
        }
        return stringBuilder.toString();
    }
}
