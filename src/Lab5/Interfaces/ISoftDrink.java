package Lab5.Interfaces;

public interface ISoftDrink {
    String getBrand();
    void setBrand(String name);

    String getExpirationDate();
    void setExpirationDate(String date);

    double getBottleVolume();
    void setBottleVolume(double volume);

    double getSugarAmount();
    void setSugarAmount(double amount);
}
