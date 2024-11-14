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
    public double calculatePrice(String size) {
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

    @Override
    public String toString() {
        return getPremiumToppingCheese();
    }
}
