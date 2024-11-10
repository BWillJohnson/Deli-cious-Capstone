package Kitchen;

public class Meats extends premiumToppings{
    private String premiumToppingMeats;

    public Meats(String premiumToppingMeats) {
        this.premiumToppingMeats = premiumToppingMeats;
    }

    public String getPremiumToppingMeats() {
        return premiumToppingMeats;
    }

    public void setPremiumToppingMeats(String premiumToppingMeats) {
        this.premiumToppingMeats = premiumToppingMeats;
    }

    @Override
    public int calculateSize(int size) {

        return 0;
    }
}
