package Kitchen;

import java.util.ArrayList;
import java.util.List;

public class sandwich implements ISizable {
    private String breadType;
    private String sandwichSize;
    private List<toppings>toppings;

    public sandwich(String breadType, String sandwichSize){
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
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
    public void addToppings(){
    }
   public void removeToppings(){

   }
    @Override
    public String toString() {
        return "sandwich{" +
                "breadType='" + breadType + '\'' +
                ", sandwichSize='" + sandwichSize + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    @Override
    public int calculateSize(int size) {
        return 0;
    }
}
