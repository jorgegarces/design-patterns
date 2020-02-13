public class Ristretto extends Beverage {

    public Ristretto() {
        String description = "Coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }

    public boolean checkPrice(double value) {
        return this.cost() == value;
    }
}
