public class Decaf extends Beverage {

    public Decaf() {
        String description = "Decaf";
    }


    @Override
    double cost() {
        return 1.5;
    }

    @Override
    boolean checkPrice(double value) {
        return this.cost() == value;
    }
}
