package com.pluralsight.FoodTruck;

import com.pluralsight.KioskInterface.IPricable;

public class Chips extends Order implements IPricable {

    private String chipName;

    public Chips(String chips) {
        this.chipName = chips;
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public void addChips(Chips chips){

        if (chips != null){
            chips.addChips(chips);
            System.out.println(chips.getChipName() + "Slurp Your drink has been added!");
        }else {
            System.err.println("Invalid Chips Come On");
        }

   }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
