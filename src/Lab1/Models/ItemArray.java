package Lab1.Models;
import Lab1.Iterfaces.IItem;
import Lab1.Iterfaces.IItemArray;

import java.util.ArrayList;
import java.util.List;

public class ItemArray implements IItemArray {
    private final List<IItem> items;

    public ItemArray() {

        this.items = new ArrayList<>();
    }

    public List<IItem> getItems(){
        return this.items;
    }

    @Override
    public double getCalculateAveragePrice() {
        return this.items
                .stream()
                .mapToDouble(IItem::getPrice)
                .average()
                .orElse(0);
    }
}
