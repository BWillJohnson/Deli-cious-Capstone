package com.pluralsight.IncludedTopping;

public class Sauce extends Topping {

    public Sauce(String toppingName) {
        super(toppingName);

    }



    public void getSauce(){

    }

    @Override
    public double calculatePrice(int size) {
        return 0;
    }
}
