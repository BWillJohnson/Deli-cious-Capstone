package com.pluralsight.PremiumTopping;

public class Cheese extends PremiumTopping {
    private String premiumToppingCheese;

    public Cheese(String toppingName) {
        super(toppingName);
    }

    public String getPremiumToppingCheese() {
        return premiumToppingCheese;
    }

    public void setPremiumToppingCheese(String premiumToppingCheese) {
        this.premiumToppingCheese = premiumToppingCheese;
    }

    @Override
    public double calculatePrice(int size) {
        return switch (size) {
            case 4 -> 1.50;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return getPremiumToppingCheese();
    }
}
