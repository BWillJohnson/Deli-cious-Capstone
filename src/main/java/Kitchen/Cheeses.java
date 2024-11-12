package Kitchen;

public class Cheeses extends premiumToppings {
    private String premiumToppingCheese;

    public Cheeses(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }

    public String getPremiumToppingCheese() {
        return premiumToppingCheese;
    }

    public void setPremiumToppingCheese(String premiumToppingCheese) {
        this.premiumToppingCheese = premiumToppingCheese;
    }
    @Override
    public double calculatePrice(double size) {
        String cheeses;
        switch (cheeses) {
            case "4\"":
                return 1.50;
            case "8\"":
                return 2.00;
            case "12\"":
                return 3.00;
            default:System.err.println("Notice! size not reachable!");
        }
        return super.calculatePrice(size);
    }

}
