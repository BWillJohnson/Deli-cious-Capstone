package Kitchen;

public class Meats extends premiumToppings {
    private Sandwich sandwich;
    private String premiumToppingMeats;

    public Meats(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }

    public String getPremiumToppingMeats() {
        return premiumToppingMeats;
    }

    public void setPremiumToppingMeats(String premiumToppingMeats) {
        this.premiumToppingMeats = premiumToppingMeats;
    }

    @Override
    public double calculatePrice(double size) {
        String sandwichSize = sandwich.getSandwichSize();
        switch (sandwichSize){
            case"4\"":
                return 1.50;
            case "8\"":
                return 2.00;
            case "12\"":
                return 3.00;
            default: System.err.println("Notice! size not reachable!");
        }
        return calculatePrice(size);
    }
}
