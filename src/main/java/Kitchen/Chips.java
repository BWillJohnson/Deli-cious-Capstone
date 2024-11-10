package Kitchen;

public class Chips implements ISizable{
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
    public int calculateSize(int size) {
        return 0;
    }
}
