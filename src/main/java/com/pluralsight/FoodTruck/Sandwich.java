package com.pluralsight.FoodTruck;

import com.pluralsight.IncludedTopping.Topping;
import com.pluralsight.KioskInterface.IPricable;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPricable {
    private String breadType;
    private int sandwichSize;
    private boolean isToasted;
    private final List<Topping> toppings;


    public Sandwich(String breadType, int sandwichSize, boolean isToasted) {
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

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public void checkIfToasted() {

        if (isToasted) {
            System.out.println("Here is your toasted sandwich!");
            isToasted = true;
        } else {
            System.out.println("Ok i wont toast up your sandwich!");
        }
    }


    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        System.out.println(topping.getToppingName() + "Topping has been added!");
    }

    public boolean removeToppings(Topping topping) {
        if (toppings.remove(topping)) {
            System.out.println(topping.getToppingName() + "Topping has been removed from your DeliSandwich.");
            return true;
        } else {
            System.err.println("Notice! No toppings have been placed on a sandwich!");
            return false;
        }
    }

    public void addSauce(Topping sauce) {
        if (sauce != null) {
            toppings.add(sauce);
            System.out.println(sauce.getToppingName() + "Your sauce has been added");
        } else {
            System.err.println("Invalid Sauce ");
        }

    }

    public boolean removeSauce(Topping sauce) {
        if (sauce != null && toppings.remove(sauce)) {
            System.out.println(sauce.getToppingName() + "Your sauce has been removed off your sandwich! ");
            return true;
        } else {
            System.err.println("No sauce has been found on your dry sandwich!");
            return false;
        }
    }


    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", sandwichSize='" + sandwichSize + '\'' +
                ", isToasted=" + isToasted +
                ", toppings=" + toppings +
                '}';
    }

    @Override
    public double calculatePrice() {
        double sizePrice = 0;
        if (sandwichSize == 4) {
            sizePrice = 5.50;
        } else if (sandwichSize == 8) {
            sizePrice = 7.00;
        } else if (sandwichSize == 12) {
            sizePrice = 8.50;
        }
        return sizePrice;
    }

    public double getBasePrice() {
        double sandPrice = 0;
        sandPrice += getBasePrice();
        for (Topping topping : toppings) {
            sandPrice += topping.getPrice();
        }
        return sandPrice;
    }

}

