package com.pluralsight.IncludedTopping;

public class Sauce extends Topping {
    private  String flavorSauce;

    public Sauce(String toppingName, String category, double price, String flavorSauce) {
        super(toppingName, category, price);
        this.flavorSauce = flavorSauce;
    }

    public String getFlavorSauce() {
        return flavorSauce;
    }

    public void setFlavorSauce(String flavorSauce) {
        this.flavorSauce = flavorSauce;
    }
    public void getSauce(){

    }
    public void removeSauce(){

    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }
}
