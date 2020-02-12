public class DarkRoast extends Beverage {

    private final double cost;

    public DarkRoast() {
        this.cost = 0.0;
    }

    @Override
    void cost() {
    }

    public boolean checkPrice(double value) {
        return this.cost == value;
    }
}
