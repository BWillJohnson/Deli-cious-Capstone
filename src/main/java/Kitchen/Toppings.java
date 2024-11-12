package Kitchen;

public abstract class Toppings {
    private String toppingName;
    private String category; // premium or regular
    private double price;

    public Toppings(String toppingName, String category, double price) {
        this.toppingName = toppingName;
        this.category = category;
        this.price = price;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice(double size){

        return size;
    }
}
