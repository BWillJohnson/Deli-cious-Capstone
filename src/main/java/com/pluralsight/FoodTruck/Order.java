package com.pluralsight.FoodTruck;

import java.util.ArrayList;
import java.util.List;

public class Order r {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculatePrice();
        }
        if (drinks != null) total +=
    }

    public void checkOut(){
    }
}
