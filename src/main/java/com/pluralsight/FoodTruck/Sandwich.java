package com.pluralsight.FoodTruck;

import com.pluralsight.IncludedTopping.Topping;
import com.pluralsight.KioskInterface.IPricable;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPricable {
    private String breadType;
    private String sandwichSize;
    private boolean isToasted;
    private List<Topping>toppings;


    public Sandwich(String breadType, String sandwichSize, boolean isToasted){
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<>();
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }
    public void checkIfToasted(){

        if (isToasted){
            System.out.println("Here is your toasted sandwich!");
            isToasted = true;
        }else {
            System.out.println("Ok i wont toast up your sandwich!");
        }
    }



    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addToppings(Topping topping){
            toppings.add(topping);
            System.out.println(topping.getToppingName() + "Topping has been added to your sandwich!");

    }
   public void removeToppings(Topping topping){
        if (toppings.remove(topping)){
            System.out.println(topping.getToppingName() + "Topping has been removed from your DeliSandwich.");
        } else{
            System.err.println("Notice! No toppings have been placed on a sandwich!");
        }
   }
    @Override
    public String calculatePrice() {
     double basePrice = 0.00;
        if ("4\"".equals(sandwichSize)){
            basePrice += 5.50;
            System.out.println("Bread size has been confirmed $" + basePrice);
        } else if ("8\"".equals(sandwichSize)) {
            basePrice += 7.00;
            System.out.println("Bread size has been confirmed $" + basePrice);
        } else if ("12\"".equals(sandwichSize)) {
            basePrice += 8.50;
            System.out.println("Bread size has been confirmed $" + basePrice);
        }else {
            System.err.println("Invalid sandwich size");
        }
        for (Topping topping : toppings) {
            basePrice += topping.getPrice();
        }
        if (isToasted) {
            basePrice += 0.00;
        }
        return String.format("TotalPrice: $%.2f",basePrice);
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", sandwichSize='" + sandwichSize + '\'' +
                ", isToasted=" + isToasted +
                '}';
    }
}
