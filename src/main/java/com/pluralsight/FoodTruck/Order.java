package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

import java.util.ArrayList;
import java.util.List;

public class Order implements IPricable {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private final List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }
    public void addChips(Chips chip){
        chips.add(chip);
    }
    public void addDrink(Drink drink){
        drinks.add(drink);
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
    public void checkOut(){
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" + sandwiches + drinks + chips;
    }
}
