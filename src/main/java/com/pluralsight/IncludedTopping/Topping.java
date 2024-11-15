package com.pluralsight.IncludedTopping;

public abstract class Topping {
    private String toppingName;
    private double price;

    public Topping(String toppingName) {
        this.toppingName = toppingName;
    }


    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculatePrice(int size);

    @Override
    public String toString() {
        return "Topping{" +
                "toppingName='" + toppingName + '\'' +
                '}';
    }
}
