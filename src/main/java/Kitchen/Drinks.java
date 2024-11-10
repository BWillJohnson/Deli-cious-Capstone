package Kitchen;

public class Drinks implements ISizable{
    private String flavoredDrink;
    private String size;

    public Drinks(String flavoredDrink, String size) {
        this.flavoredDrink = flavoredDrink;
        this.size = size;
    }

    public String getFlavoredDrink() {
        return flavoredDrink;
    }

    public void setFlavoredDrink(String flavoredDrink) {
        this.flavoredDrink = flavoredDrink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int calculateSize(int size) {
        return 0;
    }
}
