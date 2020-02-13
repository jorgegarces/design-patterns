package beverages;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.5;
    }

    public boolean checkPrice(double value) {
        return this.cost() == value;
    }
}
