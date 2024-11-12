package Kitchen;

public abstract class premiumToppings extends Toppings {
    private String premiumToppingsName;


    public premiumToppings(String toppingName, String category, double price) {
        super(toppingName, category, price);
    }
}
