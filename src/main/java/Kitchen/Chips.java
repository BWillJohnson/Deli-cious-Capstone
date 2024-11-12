package Kitchen;

public class Chips implements IPricable {
    private String typeOfChips;

    public Chips(String typeOfChips) {
        this.typeOfChips = typeOfChips;
    }

    public String getTypeOfChips() {
        return typeOfChips;
    }

    public void setTypeOfChips(String typeOfChips) {
        this.typeOfChips = typeOfChips;
    }


    @Override
    public double calculatePrice(double size) {
        return 1.50;
    }
}
