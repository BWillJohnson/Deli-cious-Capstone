package Kitchen;

public class Cheeses extends premiumToppings implements ISizable {
    private String premiumToppingCheese;

    public Cheeses(String premiumToppingCheese) {
        this.premiumToppingCheese = premiumToppingCheese;
    }

    public String getPremiumToppingCheese() {
        return premiumToppingCheese;
    }

    public void setPremiumToppingCheese(String premiumToppingCheese) {
        this.premiumToppingCheese = premiumToppingCheese;
    }

    @Override
    public int calculateSize(int size) {
        return calculatePrice(size);
    }
}
