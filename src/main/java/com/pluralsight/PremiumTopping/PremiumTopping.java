package com.pluralsight.PremiumTopping;

import com.pluralsight.IncludedTopping.Topping;

public abstract class PremiumTopping extends Topping {
    private String premiumToppingsName;


    public PremiumTopping(String toppingName) {
        super(toppingName);
    }

    @Override
    public String toString() {
        return "PremiumTopping{" +
                "premiumToppingsName='" + premiumToppingsName + '\'' +
                '}';
    }
}
