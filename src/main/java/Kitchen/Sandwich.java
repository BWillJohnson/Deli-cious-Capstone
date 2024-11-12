package Kitchen;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPricable {
    private String breadType;
    private String sandwichSize;
    private boolean isToasted;
    private List<Toppings>toppings;

    public Sandwich(String breadType, String sandwichSize, boolean isToasted){
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.isToasted = false;
        this.toppings = new ArrayList<>();
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }
    public void sandwichIsToasted(){
        String sandwich = null;
        if (sandwich.equals(isToasted)){
            System.out.println("Here is your toasted sandwich!");
            isToasted = true;
        }else {
            System.out.println("Ok i wont toast up your sandwich!");
        }
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addToppings(){


    }
   public void removeToppings(Sandwich sandwich){
        sandwich.removeToppings(sandwich);
   }

    @Override
    public double calculatePrice(double size) {
        double basePrice = 0;
        switch (size) {
            case"4\"":
                return 5.50;
            case "8\"":
                return 7.00;
            case "12\"":
                return 8.50;
            default: System.err.println("Notice! size not reachable!");
        };
        double toppingCost = toppings.stream().mapToDouble(Toppings::getPrice).sum();
        return basePrice + toppingCost;

    }


}
