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
    public double calculatePrice(String size) {
        return 0;
    }


}
