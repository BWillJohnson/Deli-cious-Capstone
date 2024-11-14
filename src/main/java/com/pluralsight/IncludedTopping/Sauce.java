package com.pluralsight.IncludedTopping;

public class Sauce extends Topping {

    public Sauce(String toppingName) {
        super(toppingName);

    }



    public void getSauce(){

    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }
}
