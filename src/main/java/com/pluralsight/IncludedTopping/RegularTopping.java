package com.pluralsight.IncludedTopping;

public class RegularTopping extends Topping {
    private String regTopping;

    public RegularTopping(String toppingName) {
        super(toppingName);
    }
    public String getRegTopping() {
        return regTopping;
    }

    public void setRegTopping(String regTopping) {
        this.regTopping = regTopping;
    }

    @Override
    public double calculatePrice(int size) {
        return 0;
    }


    @Override
    public String toString() {
        return  regTopping ;
    }
}
