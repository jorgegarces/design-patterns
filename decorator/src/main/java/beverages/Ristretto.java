package beverages;

public class Ristretto extends Beverage {

    public Ristretto() {
        description = "Ristretto";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
