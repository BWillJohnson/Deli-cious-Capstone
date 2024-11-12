package Kitchen;

public class Meats implements IPricable {
    private Sandwich sandwich;
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
    public double calculatePrice(double size) {
        String sandwichSize = sandwich.getSandwichSize();
        switch (sandwichSize){
            case"4\"":
                return 
        }
        return 0;

    }
}
