package com.pluralsight.PremiumTopping;

import com.pluralsight.IncludedTopping.Topping;

public abstract class PremiumTopping extends Topping {
    private String premiumToppingsName;


    public PremiumTopping(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }
}
