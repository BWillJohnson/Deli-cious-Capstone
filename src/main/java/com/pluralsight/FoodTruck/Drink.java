package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

public class Drink implements IPricable {
    private String flavoredDrink;
    private String size;

    public Drink(String flavoredDrink, String size) {
        this.flavoredDrink = flavoredDrink;
        this.size = size;
    }

    public String getFlavoredDrink() {
        return flavoredDrink;
    }

    public void setFlavoredDrink(String flavoredDrink) {
        this.flavoredDrink = flavoredDrink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String calculatePrice() {
        switch (this.size.toLowerCase()) {
            case "small" -> {
                return String.valueOf(2.00);
            }
            case "medium" -> {
                return String.valueOf(2.50);
            }
            case "large" -> {
                return  String.valueOf(3.00);
            }
            default -> {
                return String.valueOf(0);
            }
        }

    }
}
