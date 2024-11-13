package com.pluralsight.PremiumTopping;

public class Meat extends PremiumTopping {
    private String premiumToppingMeats;

    public Meat(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }

    public String getPremiumToppingMeats() {
        return premiumToppingMeats;
    }

    public void setPremiumToppingMeats(String premiumToppingMeats) {
        this.premiumToppingMeats = premiumToppingMeats;
    }

    @Override
    public double calculatePrice(String size) {
;
        switch (size) {
            case "4\"":
                return 1.50;
            case "8\"":
                return 2.00;
            case "12\"":
                return 3.00;
            default:
                return 0;
        }

    }
}