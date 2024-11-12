package Kitchen;

public class Drinks implements IPricable {
    private String flavoredDrink;
    private String Size;

    public Drinks(String flavoredDrink, String size) {
        this.flavoredDrink = flavoredDrink;
        this.Size = size;
    }

    public String getFlavoredDrink() {
        return flavoredDrink;
    }

    public void setFlavoredDrink(String flavoredDrink) {
        this.flavoredDrink = flavoredDrink;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public double calculatePrice(double size) {
        switch (Size.toUpperCase()) {
            case "small" -> {
                return 2.00;
            }
            case "medium" -> {
                return 2.50;
            }
            case "large" -> {
                return 3.00;
            }
            default -> System.err.println("Notice!  size not reachable!");
        }
       return calculatePrice(size);
    }
}
