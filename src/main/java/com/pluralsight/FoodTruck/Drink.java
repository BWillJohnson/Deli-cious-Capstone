package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

public class Drink  implements IPricable {


    private String drinkName;
    private String size;

    public Drink(String drinkName, String size) {
        this.drinkName = drinkName;
        this.size = size;
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
    public void getPrice(){

    }

    @Override
    public double calculatePrice() {
        switch (this.size.toLowerCase()) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                return 0;
        }

    }
}
