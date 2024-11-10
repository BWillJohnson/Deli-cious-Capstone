package Kitchen;

public class regularToppings extends toppings implements ISizable {
    private String regToppings;

    public regularToppings(String regToppings) {
        this.regToppings = regToppings;
    }

    public String getRegToppings() {
        return regToppings;
    }

    public void setRegToppings(String regToppings) {
        this.regToppings = regToppings;
    }



    @Override
    public int calculateSize(int size) {
        return 0;
    }
}
