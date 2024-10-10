package Lab1.Iterfaces;

public interface IItem {
    String getType();
    void setType(String type);
    int getQuantity();
    void setQuantity(int quantity);
    float getPrice();
    void setPrice(float price);
    int getExpirationDays();
    void setExpirationDays(int expirationDays);

}
