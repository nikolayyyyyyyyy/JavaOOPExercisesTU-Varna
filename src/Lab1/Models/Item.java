package Lab1.Models;

import Lab1.Iterfaces.IItem;

public class Item implements IItem {
    private String type;
    private int quantity;
    private float price;
    private int expirationDays;

    public Item(String type,
                int quantity,
                float price,
                int expirationDays){
        setType(type);
        setQuantity(quantity);
        setPrice(price);
        setExpirationDays(expirationDays);
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int getExpirationDays() {
        return this.expirationDays;
    }

    @Override
    public void setExpirationDays(int expirationDays) {
        this.expirationDays = expirationDays;
    }

    @Override
    public String toString() {

        String stringBuilder = "Type: " + this.type + "\n" +
                "Quantity: " + this.quantity + "\n" +
                "Price: " + this.price + "\n" +
                "ExpirationDays: " + this.expirationDays + "\n";

        return stringBuilder.trim();
    }
}
