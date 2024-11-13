package com.pluralsight.IncludedTopping;

public class RegularTopping extends Topping {
    private String regToppings;

    public RegularTopping(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }

    public String getRegToppings() {
        return regToppings;
    }

    public void setRegToppings(String regToppings) {
        this.regToppings = regToppings;
    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }


}
