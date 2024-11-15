package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

public class Drink implements IPricable {
    private static final double SMALL_SIZE_PRICE = 2.00;
    private static final double MEDIUM_SIZE_PRICE = 2.50;
    private static final double LARGE_SIZE_PRICE = 3.00;
    private String drinkName;
    private String size;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addDrink(Drink drink){
        if (drink != null){
            drink.addDrink(drink);
            System.out.println(drink.getDrinkName() + "Slurp Your drink has been added!");
        }else {
            System.err.println("Invalid Drink Come On");
        }
    }
    public boolean removeDrink(Drink drink){
        if (drink.removeDrink(drink)){
            System.out.println(drink.getDrinkName() + "Hey your drink has been removed");
        return true;
        }else {
            System.err.println("No Drink has been found in your order.");
        return false;
        }
    }

    @Override
    public double calculatePrice() {
        switch (this.size.toLowerCase()) {
            case "small" -> {
                return Double.parseDouble(String.valueOf(SMALL_SIZE_PRICE));
            }
            case "medium" -> {
                return Double.parseDouble(String.valueOf(MEDIUM_SIZE_PRICE));
            }
            case "large" -> {
                return Double.parseDouble(String.valueOf(LARGE_SIZE_PRICE));
            }
            default -> {
                return Double.parseDouble(String.valueOf(0));
            }
        }

    }
}
