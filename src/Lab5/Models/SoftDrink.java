package Lab5.Models;

import Lab5.Interfaces.ISoftDrink;

import java.util.Objects;

public class SoftDrink implements ISoftDrink {

    private String brand;
    private String expirationDate;
    private double bottleVolume;
    private double sugarAmount;

    public SoftDrink(String brand,
                     String expirationDate,
                     double bottleVolume,
                     double sugarAmount){
        setBrand(brand);
        setExpirationDate(expirationDate);
        setBottleVolume(bottleVolume);
        setSugarAmount(sugarAmount);
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String name) {
        this.brand = name;
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void setExpirationDate(String date) {
        this.expirationDate = date;
    }

    @Override
    public double getBottleVolume() {
        return bottleVolume;
    }

    @Override
    public void setBottleVolume(double volume) {
        this.bottleVolume = volume;
    }

    @Override
    public double getSugarAmount() {
        return sugarAmount;
    }

    @Override
    public void setSugarAmount(double amount) {
        this.sugarAmount = amount;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
                "ExpirationDate: " + expirationDate + "\n" +
                "BottleVolume: " + bottleVolume + "\n" +
                "Sugar Amount: " + sugarAmount + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        ISoftDrink drink = (ISoftDrink) obj;

        return this.sugarAmount == drink.getSugarAmount()
                && this.bottleVolume == drink.getBottleVolume()
                && Objects.equals(this.brand, drink.getBrand()) &&
                Objects.equals(this.expirationDate,drink.getExpirationDate());
    }
}
