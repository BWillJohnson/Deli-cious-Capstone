package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

public class Chips implements IPricable {
    private String typeOfChips;

    public Chips(String typeOfChips) {
        this.typeOfChips = typeOfChips;
    }

    public String getTypeOfChips() {
        return typeOfChips;
    }

    public void setTypeOfChips(String typeOfChips) {
        this.typeOfChips = typeOfChips;
    }


    @Override
    public String calculatePrice() {
        return String.valueOf(1.50);
    }
}
