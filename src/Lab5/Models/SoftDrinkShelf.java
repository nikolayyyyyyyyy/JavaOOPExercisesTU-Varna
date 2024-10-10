package Lab5.Models;

import Lab5.Interfaces.ISoftDrink;
import Lab5.Interfaces.ISoftDrinkShelf;

import java.util.*;
import java.util.stream.Collectors;

public class SoftDrinkShelf implements ISoftDrinkShelf {

    private final List<ISoftDrink> softDrinks;

    public SoftDrinkShelf(){

        this.softDrinks = new ArrayList<>();
    }

    @Override
    public List<ISoftDrink> getDrinks() {
        return softDrinks;
    }

    @Override
    public String getMostFrequentSoftDrink() {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(ISoftDrink drink : softDrinks) {

            if(!frequencyMap.containsKey(drink.getBrand())){

                frequencyMap.put(drink.getBrand(),1);
            } else {
                frequencyMap.put(drink.getBrand(), frequencyMap.get(drink.getBrand()) + 1);            }
        }

        frequencyMap = frequencyMap
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    return b.getValue().compareTo(a.getValue());
                }).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (c,v) -> c,
                        LinkedHashMap::new
                ));


        return frequencyMap.entrySet().iterator().next().getKey();
    }
}
