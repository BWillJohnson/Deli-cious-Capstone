package com.pluralsight.IncludedTopping;

public class Sauce extends Topping {
    private  String flavorSauce;

    public Sauce(String toppingName) {
        super(toppingName);

    }

    public String getFlavorSauce() {
        return flavorSauce;
    }

    public void setFlavorSauce(String flavorSauce) {
        this.flavorSauce = flavorSauce;
    }
    public void getSauce(){

    }
    public void addSauce(){

    }
    public void removeSauce(){

    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }
}
