package Lab2.Models;

import Lab2.Interfaces.ICar;

public class Car implements ICar {
    private String brand;
    private String registrationNumber;
    private double mileage;

    public Car(String brand,String registrationNumber,double mileage){
        setBrand(brand);
        setRegistrationNumber(registrationNumber);
        setVarMileage(mileage);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public void setRegistrationNumber(String regNumber) {
        this.registrationNumber = regNumber;
    }

    @Override
    public double getCarMileage() {
        return this.mileage;
    }

    @Override
    public void setVarMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {

        String stringBuilder = "Brand: " +
                this.brand + "\n" +
                "Registration Number: " +
                this.registrationNumber + "\n" +
                "Mileage: " +
                this.mileage + "\n" +
                "\n";

        return stringBuilder.trim();
    }
}
