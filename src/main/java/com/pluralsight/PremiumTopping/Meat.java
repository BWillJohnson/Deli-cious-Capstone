package com.pluralsight.PremiumTopping;

public class Meat extends PremiumTopping {
    private String premiumToppingMeats;

    public Meat(String toppingName) {
        super(toppingName);
    }

    public String getPremiumToppingMeats() {
        return premiumToppingMeats;
    }

    public void setPremiumToppingMeats(String premiumToppingMeats) {
        this.premiumToppingMeats = premiumToppingMeats;
    }

    @Override
    public double calculatePrice(int size) {

        switch (size) {
            case 4:
                return 1.50;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return 0;
        }

    }

    @Override
    public String toString() {
        return getPremiumToppingMeats();
    }
}
