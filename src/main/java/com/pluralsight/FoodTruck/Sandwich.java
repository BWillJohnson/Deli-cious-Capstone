package com.pluralsight.FoodTruck;

import com.pluralsight.IncludedTopping.Topping;
import com.pluralsight.KioskInterface.IPricable;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPricable {
    private static final double SMALL_SIZE_PRICE = 5.50;
    private static final double MEDIUM_SIZE_PRICE = 7.00;
    private static final double LARGE_SIZE_PRICE = 8.50;


    private String breadType;
    private String sandwichSize;
    private boolean isToasted;
    private List<Topping> toppings;


    public Sandwich(String breadType, String sandwichSize, boolean isToasted) {
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

    @Override
    public String calculatePrice() {
        double basePrice = 0.00;
        if ("4\"".equals(sandwichSize)) {
            basePrice += 5.50;
            System.out.println("Bread size has been confirmed $" + basePrice);
        } else if ("8\"".equals(sandwichSize)) {
            basePrice += 7.00;
            System.out.println("Bread size has been confirmed $" + basePrice);
        } else if ("12\"".equals(sandwichSize)) {
            basePrice += 8.50;
            System.out.println("Bread size has been confirmed $" + basePrice);
        } else {
            System.err.println("Invalid sandwich size");
        }
        for (Topping topping : toppings) {
            basePrice += topping.getPrice();
        }
        if (isToasted) {
            basePrice += 0.00;
        }
        return String.format("TotalPrice: $%.2f", basePrice);
    }

    public void addSauce(Topping sauce) {
        if (sauce != null) {
            toppings.add(sauce);
            System.out.println(sauce.getToppingName() + "Spicy!...! Your sauce has been added");
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
}
