package Kitchen;

public class sauces implements IPricable {
    private  String flavorSauce;

    public sauces(String flavorSauce) {
        this.flavorSauce = flavorSauce;
    }

    public String getFlavorSauce() {
        return flavorSauce;
    }

    public void setFlavorSauce(String flavorSauce) {
        this.flavorSauce = flavorSauce;
    }
    public void getSauce(){

    }
    public void removeSauce(){

    }

    @Override
    public double calculatePrice(double size) {
        return 0;
    }
}
